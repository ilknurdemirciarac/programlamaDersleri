package arraysDemo;
public class Main {
    public static void main(String[] args) {
        //Ders 14 : Dizilerle Çalışmaya Başlamak
        
        String ogrenci1="Engin";
        String ogrenci2="Derin";
        String ogrenci3="Salih";
        String ogrenci4="Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------");

       // String[] ogrenciler=new String[3]; //dizilerde sınırları aştığımızda hata alırız
        String[] ogrenciler=new String[4];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
            //ogrencilerin i inci 0. 1.2. elemanını yazdırıyorum.            
        }
        System.out.println("----------------");
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
        



    }
    
}
