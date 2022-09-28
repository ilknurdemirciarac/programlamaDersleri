package business.concretes;



import business.abstracts.IVerificationService;

public class EmailVerificationManager implements IVerificationService {

    @Override
    public boolean checkVerifyAccount(String email) {
        if(ifClickedLink(email)==true){
            System.out.println("Hesap doğrulanmıştır..");
            return true;

        }
        return false;
       
    }

    @Override
    public boolean ifClickedLink(String email) {
        
        return true;
    }

    @Override
    public void sendToVerifyMail(String email) {
        System.out.println("Doğrulama linki gönderildi..");        
        
    }
    
    
    
}
