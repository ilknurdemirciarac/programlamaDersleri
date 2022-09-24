package sayiBulma;
public class Main{
    public static void main(String[] args) {
        int[] sayilar=new int[] {1,2,5,7,9,0};
        int aranacak=5;
        boolean varMi=false;

        for (int sayi: sayilar) {
            if(aranacak==sayi){
               varMi=true; 
               break;
            }            
        }
        if(varMi)
        {        
            System.out.println(aranacak+" sayılar içince mevcut.");
        }
        else{
            System.out.println(aranacak+" sayılar içince mevcut değil.");
        }


    }

}