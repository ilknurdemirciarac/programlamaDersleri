package classes;
public class Main {
    public static void main(String[] args) {
        //class çağıralım
        CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;
        
        //reference type -->class stack customerManager değerler heap içinde nesne new ile oluşuyor 

        //class içindeki metodu çağıralım
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value deger tipi

        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);

        //diziler reference tip tir

        int[] sayilar1=new int[]{1,2,3};
        int[] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0 ]);
        

        
    }
    
}

