package loopDemo;
public class Main {
    public static void main(String[] args) {
        //Ders 11: For döngüsü 

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            
        }
        System.out.println("Döngü Bitti");
        //tek sayıları yazdırmak istersem
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);            
        }
        //çifty sayıları yazdırmak istersem
        for (int i = 2; i < 10; i+=2) {
            System.out.println(i);            
        }
        System.out.println("For Döngüsü Bitti");

        //Ders 12: While Döngüsü
        //şart sağlanınca döngüye başlar ve şart sağlandığı müddetçe çalışır

        //for blopunda tanımlanan i değişkeni sadece o blok içinde kullanılır. {} alanı içinde geçerlidir.
        
        /*infinit --> loop sonsuz döngü 
         * int i=1;
            while(i<10){
                System.out.println(i);   
            }

            i 1 ile başladı hiç artmadığı için sürekli 1 kalacak ve 10 sayısından küçüktür şartı sağlanmaya devam edeceği için sonsuz döngüye girecektir. 
        */
        int i=1;
        while(i<10){
            System.out.println(i);  
            i++;        //i=i+1; demek
        }
        while(i<10){
            System.out.println(i);  
            i+=2;        //i=i+1; demek
        }
        i=2;
        while(i<10){
            System.out.println(i);  
            i+=2;        //i=i+1; demek
        }
        System.out.println("While döngüsü bitti.");

        //ders 13: Dop While Döngüsü
        //while ile dowhile farkı ise while şart sağlanmazsa çalışmaz do while ise şart sonradan bakıldığı için şartsağlanmasa bilr bir kere çalışacaktır.
        int j=100;

        do {
            //System.out.println("Loglandı");
            System.out.println(j);
            j+=2;            
        } while (j<10);
        System.out.println("Do While döngüsü bitti.");

    
    }
    
}
