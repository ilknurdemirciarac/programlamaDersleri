
package stringsDemo;
public class Main {
    public static void main(String[] args) {
        //Ders 17 : Stringlerle Çalışmak 1
            //java da büyük küçük harf duyarlılığı vardır.
        String mesaj="Bugün hava çok güzel";
        System.out.println(mesaj); //ekrana yazdır

        System.out.println("Eleman sayısı : "+mesaj.length());           //metindeki karakter sayısı
        System.out.println("5. Eleman  : "+mesaj.charAt(4));      //0 dan başladığı için 5. eleman 4 olarak görüldü.
        System.out.println(mesaj.concat(" Yaşasın!"));              //birleştir 
        System.out.println(mesaj.startsWith("B"));              //başlangıç karakteri verilen karakter ile başlıyorsa true başlamıyorsa false 
        System.out.println(mesaj.endsWith("."));                //son karakteri verilen karakter ile başlıyorsa true başlamıyorsa false
        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);  //0 dan başla 5. elemana kadar al karakterlere dizisine aktar, ilk 5 karakteri aldık karakterler'e aktar.
        System.out.println(karakterler);   
        System.out.println(mesaj.indexOf("av"));                     // soldan başlıyor ilk bulduğu "a" karakterinin bulduğu karakter sayısını veriyor. 7. karakterdir.
        System.out.println(mesaj.lastIndexOf("a"));                 //en sağdan aramaya başlıyor.
        

        //Ders 18: Stringler ile çalışmak 2

        String yeniMesaj=mesaj.replace(' ','-');        //eski değer yeni değer ile değiştir
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2));             //2. indexte(0,1,2) den itibaren sonuna kadar alır, gün hava çok güzel
        System.out.println(mesaj.substring(2,4));    //(2,4) 2 den başla 4 e akdar al           gü

        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);//her boşlukta bir sonrakine kadar yazdı            
        }

        System.out.println(mesaj.toLowerCase());//küçük harfe çevir
        System.out.println(mesaj.toUpperCase());//büyük harfe çevir

        mesaj="        Bugün hava çok güzel      ";
        System.out.println(mesaj.trim());
    }
    
}
