
package business.abstracts;

public interface IVerificationService{
    void sendToVerifyMail(String email);
    boolean ifClickedLink(String mail);
    boolean checkVerifyAccount(String mail);
}