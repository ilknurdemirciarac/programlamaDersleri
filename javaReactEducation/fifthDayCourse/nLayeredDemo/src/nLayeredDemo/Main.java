package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdaptor;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main{
  
    /**
     * @param args
     */
    public static void main(String[] args) {
        //nlayer çoklu layer
    //test ortamı
    //entity hariç new liyorsak ileride problem olacaktır.

    //şuan kötü kod yazıyoruz

    //to do :spring IOC ile çözülecek
    ProductService productService=new ProductManager(new HibernateProductDao(),new JLoggerManagerAdaptor());//test etmek zorundayız
    Product product=new Product(1,1,"Elma",12.0,50);
    productService.add(product);    
    ProductService productService2=new ProductManager(new AbcProductDao(),new JLoggerManagerAdaptor());//test etmek zorundayız
    Product product2=new Product(2,2,"Elma",12.0,50);
    productService2.add(product2);     
    }
}