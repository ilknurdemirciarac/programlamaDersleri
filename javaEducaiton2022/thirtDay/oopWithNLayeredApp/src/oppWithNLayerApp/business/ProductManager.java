package oppWithNLayerApp.business;

import java.util.List;

import oppWithNLayerApp.core.logging.Logger;
import oppWithNLayerApp.dataAccess.HibernateProductDao;
import oppWithNLayerApp.dataAccess.JdbcProductDao;
//import oppWithNLayerApp.dataAccess.JdbcProductDao;
import oppWithNLayerApp.dataAccess.ProductDao;
import oppWithNLayerApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;
    
    public ProductManager(ProductDao productDao,List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception{
        //iş kuralları


        if(product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);
        for (Logger logger : loggers) {//db,mail
            logger.log(product.getName());
            
        }


        //JdbcProductDao productDao=new JdbcProductDao();
        //HibernateProductDao productDao=new HibernateProductDao();
        // productDao.add(product);

       
       

        //bir katman başkabir katmanın (busines için geçerli) başka bir katmanın classını kullanıyorken sadece interface erişim kurmalıdır.


    }
    
}
