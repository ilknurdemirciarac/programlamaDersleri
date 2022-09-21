package abstractClasses;

public abstract class GameCalculator {
    //abstract class ta mutlka abstract olmak zorunda değil
    //abstract sınıflar asla new yapılamaz yapılabilri ama yapılmamalı
    public abstract void hesapla();//kim çağırıyorsa içini o dolduracak

    public void gameOver(){
        System.out.println("Oyun Bitti");
    }
    

    
}
