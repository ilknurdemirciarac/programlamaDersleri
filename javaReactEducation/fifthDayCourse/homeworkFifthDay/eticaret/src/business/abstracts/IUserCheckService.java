package business.abstracts;

import entities.concretes.User;

public interface IUserCheckService {
    boolean checkFirstName(User user);
    boolean checkLastName(User user);
    boolean checkEmail(User user);
    boolean checkPhoneNumber(User user);
    boolean checkPassword(User user);
    boolean uniqueEmail(User user);
    boolean isValid(User user);
    
}
