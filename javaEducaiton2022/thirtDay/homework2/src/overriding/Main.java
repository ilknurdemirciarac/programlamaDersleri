package overriding;

public class Main {
    public static void main(String[] args) {
        OgretmenKerediManager ogretmenKerediManager=new OgretmenKerediManager();
        System.out.println(ogretmenKerediManager.hesapla(1200));

        BaseKrediManager[] krediManagers=new BaseKrediManager[]{new OgretmenKerediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
        
        for (BaseKrediManager krediManager : krediManagers) {

            System.out.println(krediManager.hesapla(1000));
            
        }
    }
    
}
