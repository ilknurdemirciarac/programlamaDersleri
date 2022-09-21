package staticDemo;

public class ProductManager {
    public void add(Product product){

        //static tanımladığımızda o bellekte kapaıncaya kadar silinmiyor
        
        ProductValidator validator=new ProductValidator();
        if(validator.isValid(product)){
            System.out.println("Eklendi");
        }
        else{
            System.out.println("Ürün bilgileri geçersizdir.");
        }

    }
    
}
