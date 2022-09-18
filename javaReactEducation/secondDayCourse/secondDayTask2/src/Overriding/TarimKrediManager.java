package Overriding;

public class TarimKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        return tutar*1.09;
    }
    
}
