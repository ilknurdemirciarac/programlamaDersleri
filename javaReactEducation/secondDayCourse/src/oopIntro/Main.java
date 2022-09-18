package oopIntro;
public class Main {
    public static void main(String[] args) throws Exception {
        /*String[] products={
            "Lenova V14",
            "Lenova V15",
            "Hp 5",
        };
        Int[] unitsInStock={
            3,4,5,
        };*/
        //böyle bişey yok
        //bunun yerine objelerle çalışırız.

        //Product class ı oluşturalım.


        Product product1=new Product();//referans oluşturma, instance
        product1.id=1;
        product1.name="Lenova V14";
        product1.unitPrice=15000;
        product1.detail="16 GB Ram";

        Product product2=new Product();
        product2.id=2;
        product2.name="Lenova V15";
        product2.unitPrice=16000;
        product2.detail="16 GB Ram";

        Product product3=new Product();
        product3.id=3;
        product3.name="HP 5";
        product3.unitPrice=10000;
        product3.detail="8 GB Ram";
        Product product4=new Product(4,"DELL",20000,"16 GB Ram");

        Product[] products={product1,product2,product3,product4};

        //foreach
        //Product veri türü product değişken ismi gibi isim products array dizisi
        for (Product product : products) {
            System.out.println(product.id+" "+product.name+" "+product.unitPrice+" "+product.detail);
            
        }
        
        System.out.println("kayıtlı ürün adeti "+products.length);


        //Category class olusturalım

        Category category1=new Category();
        category1.id=1;
        category1.name="Bilgisayar";

        Category category2=new Category();
        category2.id=1;
        category2.name="Ev/Bahçe";

        
        ProductManager productManager=new ProductManager();
        //productManager.addToCard(); //parametresiz metod
        productManager.addToCard(product1);// parametreli metod
        productManager.addToCard(product2);
        productManager.addToCard(product3);


    }




}
