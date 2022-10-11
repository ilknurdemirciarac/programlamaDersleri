package staticDemo;

public class ProductValidator {

    static{
        System.out.println("static yapıcı blok çalıştı");
    }
    
    public ProductValidator() {
        System.out.println("validator çalıştı.");
    }

    public static boolean isValid(Product product){//bir kere oluşur hep aynı kullanılır.
        if(product.price>0&& !product.name.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public void bisey(){}

    
    //inner class
}
