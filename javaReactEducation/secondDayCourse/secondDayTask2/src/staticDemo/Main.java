package staticDemo;
public class Main {
    public static void main(String[] args) {
        
    ProductManager manager=new ProductManager();
    Product product=new Product();
    product.price=10;
    product.name="";

    manager.add(product);

    //staticler direk class adıyla çağrılabilir.

    DatabaseHelper.Crud.Delete();
    DatabaseHelper.Connection.createConnection();
    //bu önerilmiyor
    }
}
