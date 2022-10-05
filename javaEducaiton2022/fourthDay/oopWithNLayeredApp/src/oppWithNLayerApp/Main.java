package oppWithNLayerApp;

import java.util.ArrayList;
import java.util.List;

import oppWithNLayerApp.business.ProductManager;
import oppWithNLayerApp.core.logging.DatabaseLogger;
import oppWithNLayerApp.core.logging.FileLogger;
import oppWithNLayerApp.core.logging.Logger;
import oppWithNLayerApp.core.logging.MailLogger;
import oppWithNLayerApp.dataAccess.HibernateProductDao;

import oppWithNLayerApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1=new Product(1,"Iphone",1200);

        List<Logger> loggers=new ArrayList<Logger>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());
        
        
        ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);
    }
    
}
