package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;


public class ProductManager implements ProductService{
//sağ tık add unimplement
    /* (non-Javadoc)
     * @see nLayeredDemo.business.abstracts.ProductService#add(nLayeredDemo.entities.concretes.Product)
     */
      
    private LoggerService loggerService;
    private ProductDao productDao;//gevşek bağlı dataaccess e
    //sağ tıkla constructor
    
    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    /* (non-Javadoc)
     * @see nLayeredDemo.business.abstracts.ProductService#add(nLayeredDemo.entities.concretes.Product)
     */
    @Override
    public void add(Product product) {
        //iş kodları yazılır
        if(product.getCategoryId()==1){
            System.out.println("Bu kategoride ürün kabul edilmiyor.");
            return;//metod aşağı bakmaz işi bitirir.
        }
       /* HibernateProductDao dao=new HibernateProductDao();
        dao.add(product);*/ //bağımlı yapıdır
        //yapıları bağımsız hale getir.
        //dependency injection yapmalıyız.
        this.productDao.add(product);//hipernate e bağımlı değil
        this.loggerService.logToSystem("Ürün Eklendi "+product.getName());
        


        
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    
}
