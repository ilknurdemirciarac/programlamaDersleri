package inheritance2;

public class EmailLogger extends Logger {

    @Override
    public void log() {
        super.log(); //metod override ettik logger üstünde sağ tıkla override seç log u seç
        System.out.println("Email Loglandı");

    }
    
}
