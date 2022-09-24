package switchDemo;

public class Main {
    public static void main(String[] args) {
        // Ders 10 : Switch bloklarıyla çalışmak

        // if bloklarına göre daha az kulanılır.

        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalasef  : Kaldınız");
                break;

            default:
                System.out.println("Geçersiz not girdiniz.");
                break;
        }

    }

}
