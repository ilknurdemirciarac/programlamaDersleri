package polimorphizmDemo;

public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
    this.logger=logger;        
    }
    public void add(){
        System.out.println("Müşteri eklendi."); 
        this.logger.Log("Log mesajı");
   }
    public void update(){
        System.out.println("Müşteri güncellendi."); 

    }
    
}
