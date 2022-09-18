package oopIntro;

public class ProductManager {
    //iş yapan sınıf

    /*public void addToCard(){//parametresiz
        System.out.println("Sepete ekleme kodu çağırıldı!");

    }*/
    public void addToCard(Product product){//parametreli
        System.out.println("Sepete ekleme kodu çağırıldı! : "+product.name);

    }

    
}
