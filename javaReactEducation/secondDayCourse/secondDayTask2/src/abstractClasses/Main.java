package abstractClasses;
public class Main {
    public static void main(String[] args) {
        //aynı komutu farklı kullanıcılar için kullanılırsa 
        WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator=new WomanGameCalculator();
        gameCalculator.hesapla();

    }
    
}
