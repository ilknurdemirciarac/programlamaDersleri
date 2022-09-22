package oopIntro;

public class Product {
    
    int id;
    

    String name;
    double unitPrice;
    String detail;
    //constructor bloğu

    public Product(){
        //yapıcı başlangıçta olması gereken kodlar burada
        System.out.println("Ben Çalıştım");
        
    }
    
    public Product(int id,String name, double unitPrice,String detail){ //
        this();
        this.id=id;
        this.name=name;
        this.unitPrice=unitPrice;
        this.detail=detail;


    }

    //birden fazla constructor varsa sadece biri çalışmaktadır.

    //metod burada  da yazabiliriz fakat 
    //classlar ikiye ayrılır 1 özellik tutan class 2 metod tutan class 

    //id üstünde sağ tıkla source constructer tıkla hangileri eklenecekse o fieldları seç
   
    
    
}
