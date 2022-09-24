package mukemmelSayi;

public class Main {
    public static void main(String[] args) {
        //Ders 21: Mükemmel sayı

        // 6 --> 1,2,3 bölünür 1+2+3=6
        // 28 -->1,2,4,7,14 bölünür
        int number = 28;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println(number + " : sayısı Mükemmel sayıdır.");
        } else {
            System.out.println(number + " : sayısı Mükemmel sayı değildir.");
        }

        
    }

}
