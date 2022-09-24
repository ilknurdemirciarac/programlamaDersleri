package conditionals;
public class Main {
    public static void main(String[] args) {

        //Ders 8 : Şart Blokları
        int sayi=24;

        if(sayi<20){//şart sağlanıyorsda çalışır
            System.out.println("Sayı 20'den küçüktür.");
        }
        else{//şart sağlanmıyorsa çalışır.
            System.out.println("Sayı 20'den küçük değildir");
        }

        if(sayi<20){//şart sağlanıyorsda çalışır
            System.out.println("Sayı 20'den küçüktür.");
        }
        else if(sayi==20){//şart sağlanıyorsa çalışır.
            System.out.println("Sayı 20'ye eşittir'");
        }
        else{//şart sağlanmıyorsa çalışır.
            System.out.println("Sayı 20'den büyüktür.");
        }
        


    }
    
}
