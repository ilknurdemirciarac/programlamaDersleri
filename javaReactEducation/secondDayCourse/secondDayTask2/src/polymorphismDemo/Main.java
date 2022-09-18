package polymorphismDemo;

import java.lang.System.Logger;

public class Main {
    public static void main(String[] args) {
        //log lama
        EmailLogger logger=new EmailLogger();
        logger.log("Log message");
        //overloading üzerine yazma
        //polimorphism
        DatabaseLogger databaseLogger=new DatabaseLogger();
        databaseLogger.log("Log message");
        FileLogger fileLogger=new FileLogger();
        fileLogger.log("Log message");


        BaseLogger[] loggers=new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()}; //hepsinin annesi baselogger

        for (BaseLogger log : loggers) {
            log.log("Log mesajı : ");
            
        }

        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();
        CustomerManager customerManager2=new CustomerManager(new FileLogger());
        customerManager2.add();


    }
    
}
