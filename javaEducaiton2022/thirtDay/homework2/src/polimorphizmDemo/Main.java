package polimorphizmDemo;

public class Main {
    public static void main(String[] args) {
        
        /*EmailLogger logger =new EmailLogger();
        logger.Log("Log mesajı");

        BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};

        for (BaseLogger loggerr: loggers) {
            loggerr.Log("Log Mesajı");*/

            CustomerManager customerManager=new CustomerManager(new FileLogger());
            customerManager.add();
            
        }
    }
    

