package thirdDayCourse.kodlamaIo;

public class UserManager {
    public void add(User user){
        System.out.println(user.getFirstName()+" "+user.getSurName()+" isimli kullanıcı bilgileri database e eklendi");

    }
    public void update(User user){
        System.out.println(user.getFirstName()+" "+user.getSurName()+" isimli kullanıcı bilgileri database de güncellendi");

    }

    public void delete(User user){
        System.out.println(user.getFirstName()+" "+user.getSurName()+" isimli kullanıcı bilgileri databaseden silindi");

    }
    public void addMultiple(User[] users){
        for (User user : users) {
            this.add(user);
            
        }
    }



    
}
