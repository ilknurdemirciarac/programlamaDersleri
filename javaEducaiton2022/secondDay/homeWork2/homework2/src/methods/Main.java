package methods;
public class Main {
    public static void main(String[] args) throws Exception {
        sayiBulmaca(); // metod çağrıldı
        

        //metod yazarak tekrar etmeyi engelliyoruz.
    }
    public static void sayiBulmaca(){//metod oluşturuldu
        int[] sayilar=new int[]{1,2,5,4,7,8,10,9,0};
        int aranacak=6;
        boolean varMi=false;

        for(int sayi:sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        String mesaj;

        if(varMi){
            mesaj="Sayı Mevcut : "+ aranacak;
            //System.out.println("Sayı Mevcuttur. "+aranacak);            
        }
        else{
            //System.out.println("Sayı Mevcut Değildir. "+aranacak);
            mesaj="Sayı Mevcut Değil : "+ aranacak;           
        }
        mesajVer(mesaj);
    }
    public static void mesajVer(String mesaj){//method isimleri camelCase yazılır. class isimleri PascalCase yazılır.
        //parametreli metod
        System.out.println(mesaj);
    }
}
