package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
    //somut veri erişim interface 
    //ürün ekleme,listeleme,güncelleme,

    void add(Product product);
    void update(Product product);
    void delete(Product product);
    //ürün arama
    Product get(int id);//arama
    List<Product> getAll(); //listeleme
    //array sabit yapılardır. 
    //list içine sınırsız veri ekleyebilirsin
    //List interface dir
    

    


    
}
