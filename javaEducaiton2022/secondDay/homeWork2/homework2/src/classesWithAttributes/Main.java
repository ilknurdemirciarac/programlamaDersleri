package classesWithAttributes;
public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        Product product2=new Product(2,"Tablet","Ipad",5000,3,"blue");

        ProductManager productManager=new ProductManager();
        productManager.Add(product);

        System.out.println(product.getName()+" "+product.getCode());
        System.out.println(product2.getName()+" "+product2.getCode()+" "+product2.getDescription());
    }
    
}
