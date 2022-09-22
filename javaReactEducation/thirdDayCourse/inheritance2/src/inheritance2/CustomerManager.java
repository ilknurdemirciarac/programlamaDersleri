package inheritance2;

public class CustomerManager  {
    public void add(Logger logger){
        //Müşteri ekleme kodları
        System.out.println("Müşteri eklendi");
        //loglama da yapalım
        logger.log();
        //başka sınıfları iş yapan sınıf başkabir iş yapan sınıfı kullanacaksa asla somut sınıftan gidilmez file databaze email gibi iş yapan sınıf. new leme
    }
    
}
