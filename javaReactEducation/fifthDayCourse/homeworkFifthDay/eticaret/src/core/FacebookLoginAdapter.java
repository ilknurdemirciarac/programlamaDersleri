package core;

import entities.concretes.User;

public class FacebookLoginAdapter implements ILogInService{

    @Override
    public void logIn(User user) {
        System.out.println("Facebook ile giriş yapıldı.");
        
    }

    
}
