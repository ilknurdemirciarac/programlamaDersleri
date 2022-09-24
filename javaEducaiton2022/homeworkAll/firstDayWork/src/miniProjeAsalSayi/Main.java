package miniProjeAsalSayi;
public class Main {
    public static void main(String[] args) {

        //Ders 20: asal sayı

        int number=25;
        //bog
        int remainder=number%2; 
        boolean isPrime=true;//asalmı
        System.out.println("kalan : "+ remainder);
        if(number==1){
            System.out.println("Sayı asal sayı değildir.");
            return;//buradan sonraki kodları çalıştırmayacak
        }
        if(number<1){
            System.out.println("Geçersiz sayı girildi");
        }

        for (int i = 2; i < number; i++) {

            if(number%i==0){
                isPrime=false;
            }          
            
        }
        
        if (isPrime){
            System.out.println(number+ " sayısı ASAL sayıdır ");
        }
        else{
            System.out.println(number+ " sayısı ASAL sayı değildir. ");
        }
        
    }
    
}
