package sesliHarfler;

public class Main {
    public static void main(String[] args) {
        char harf = 'A';

        switch (harf) {
            case 'A':
                System.out.println("Kalın Sesli Harf");
                break;
            case 'I':
                System.out.println("Kalın Sesli Harf");
                break;
            case 'O':
                System.out.println("Kalın Sesli Harf");
                break;
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            case 'E':
                System.out.println("İnce Sesli Harf");
                break;
            case 'İ':
                System.out.println("İnce Sesli Harf");

                break;
            case 'Ö':
                System.out.println("İnce Sesli Harf");

                break;
            case 'Ü':
                System.out.println("İnce Sesli Harf");

                break;

            default:
                System.out.println(" Sesli harflerden birini girmediniz.");
                break;
        }

    }
}