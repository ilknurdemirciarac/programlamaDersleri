package classesWithAttribute;
class Main{
    public static void main(String[] args) {
        Product product=new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("ASUS NoteBook");
        product.setPrice(10000);
        product.setStockAmount(3);

        Product product1=new Product(2,"Tablet","IPAd",4000,5,"siyah");
        

        ProductManager productManager=new ProductManager();
        productManager.add();

        System.out.println(product.getKod());
        System.out.println(product1.getKod());
    }
}