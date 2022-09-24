package datatypes;
public class Main{
    public static void main(String[] args) {
        //ders 7: 
        //int sayi=12;
       /* sayi="Ankara"; //hata verdi uyumsuz tipler
        sayi=111111111111;//integer tamsayı sınırları dışına çıktığımda hata verdi.
        byte sayi=129; //byte veri türü -128 ile 127 arasında sayı tutmaktadır. 
         char karakter="Ankara";//hava verdi sayısal bir karakter ASCII kodu 
        */
        double sayi=12.5;
        sayi=-129;

        char karakter='A'; //tek bir karakter ve tek tırnak kullanımı
        
        boolean dogruMu=false; //true false değerini tutar.

        /*if(dogruMu==true)
        {

        }*/
        System.out.println(sayi);
        System.out.println(karakter);
        System.out.println(dogruMu);



    }
}
