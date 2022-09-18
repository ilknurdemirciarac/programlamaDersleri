public class firstCode {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        //Değişken isimlendirmeleri camelCase yazılır.
        String ortaMetin="ilginizi çekebilir";
        String altMetin="İşlem süresi";

        System.out.println("ortaMetin"); //"" içinde yazılan kısım metin olarak yazılır

        System.out.println(ortaMetin);
        System.out.println("Alt Metin " + altMetin);

        //sayısal değişkenler 
        //integer tamsayı

        int sure=12;

        //double ondalık sayı
        double dolarDun=18.14;
        double dolarBugun=18.10;

        //mantıksal veri tipi boolean
        boolean dolarDustuMu=true;

        String okYonu;

        if(dolarBugun<dolarDun){ //true düşükse
            okYonu="down.svg";
        }
        else if(dolarBugun>dolarDun){//true yüksekse
            okYonu="up.svg";
        }
        else{//false eşitse
            okYonu="equal.svg";
        }
        System.out.println(okYonu);

        //Array diziler

        String[] krediler={"Hızlı Kredi","Maaşını Halkbank'tan alanlar","Mutlu Emekli"};
        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);

        System.out.println("tek kod ile yazalım");
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);            
        } 





    }
    
}
