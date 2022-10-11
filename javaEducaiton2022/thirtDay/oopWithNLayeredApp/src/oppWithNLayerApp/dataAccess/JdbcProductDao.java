package oppWithNLayerApp.dataAccess;

import oppWithNLayerApp.entities.Product;
public class JdbcProductDao implements ProductDao {
    //Bu katmana sadece ve sadece db erişim kodları buraya yazılır. SQL

    public void add(Product product){
        System.out.println("JDBC ile veritabanına eklendi");
    }
    
}
//Hibernate
