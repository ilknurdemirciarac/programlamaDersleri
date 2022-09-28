import business.concretes.EmailVerificationManager;
import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import core.FacebookLoginAdapter;
import core.GoogleLoginAdaptor;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main{
    public static void main(String[] args) {
        
        User usera=new User( "İlknur","araç","ilknur@gmail.com","05052012012","223421");
        UserManager userManager=new UserManager(new HibernateUserDao(),new UserCheckManager(),new EmailVerificationManager());

          userManager.signIn(usera);   

        userManager.logIn("ilknur@gmail.com",  "223421");

        User user1=new User();
        User user2=new User();
        UserManager userManagerAdaptor=new UserManager();
        userManagerAdaptor.withAdapterLogin(new GoogleLoginAdaptor(), user1);
        userManagerAdaptor.withAdapterLogin(new FacebookLoginAdapter(), user2);
    }
}