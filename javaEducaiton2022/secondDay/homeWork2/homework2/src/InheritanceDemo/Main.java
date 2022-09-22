package InheritanceDemo;
public class Main {
    public static void main(String[] args) {
        //OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
       // ogretmenKrediManager.Hesapla();
       // TarimKrediManager tarimKrediManager=new TarimKrediManager();
       // tarimKrediManager.Hesapla();
        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());
    }
    
}
