package intro;
public class Main {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //camelCase

        //don't repeat yourself

        String internetSubeButonu="İnternet Şubeye gir";

        System.out.println(internetSubeButonu);
        System.out.println(internetSubeButonu);
        System.out.println(internetSubeButonu);
        System.out.println(internetSubeButonu);
        System.out.println(internetSubeButonu);
        System.out.println(internetSubeButonu);
        System.out.println(internetSubeButonu);

        double dolarDun=18.20;
        double dolarBugun=18.10;

        int vade=36;
        
        boolean dutuMu=false;

        if(dolarDun>dolarBugun){
            System.out.println("Dolar Düştü resmini getir");
        }
        else{
            System.out.println("Dolar Yükseldi resmini getir");
        }

        //elle yazdığım kodlar

        String kredi1="Hızlı Kredi";
        String kredi2="Mutlu emekli kredisi";
        String kredi3="Konut Kredisi";
        String kredi4="Çiftçi Kredisi";
        String kredi5="Msb Kredisi";

        System.out.println(kredi1);
        System.out.println(kredi2);
        System.out.println(kredi3);
        System.out.println(kredi4);
        System.out.println(kredi5);
        //yukarıdaki yerine listede tutsam daha iyi olacak

        //Array dizi

        System.out.println("**********************");
        System.out.println("Array");

        String[] krediler={
            "Hızlı Kredi",
            "Mutlu emekli kredisi",
            "Konut Kredisi",
            "Çiftçi Kredisi",
            "Msb Kredisi",
        };
        for (String kredi : krediler) {
            System.out.println(kredi);
            
        }
        System.out.println("**********************");

        System.out.println("For Döngüsü");

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
        //tamsayılar

        //integer
        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi2=100;
        System.out.println(sayi1); //20 stack  değer tipi sayi1 sayi2 oldu ve daha sonra değişen sayi2 ile bağlantısı kalmadı.

        int[] sayilar1={1,2,3,4,5};
        int[] sayilar2={10,20,30,40,50};
        sayilar1=sayilar2;
        sayilar2[0]=100;
        System.out.println(sayilar1[0]); //100 heap bölümü sayılar1 sayılar2 de ne olursa onu tututyor
        //bellekte tutulduğu yerlerin farklı olmasından dolayı bu durum oluştu.

        String sehir1="Ankara"; //String deger tip oarak çalışıyor istisnadır çünkü aslı karakterdizisidir 
        String sehir2="İstanbul";
        sehir1=sehir2;
        sehir2="İzmir";
        System.out.println(sehir1);








    }
}
