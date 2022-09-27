package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdaptor implements LoggerService {
    //adaptasyon sınıfı

    @Override
    public void logToSystem(String message) {
        JLoggerManager manager=new JLoggerManager();
        manager.log(message);
        
    }
    
}
