import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {
    private List<IPayee> payees;
    private Double taxRate = 0.2;

    public PaymentSystem(){
        payees=new ArrayList<>();
    }

    public void addPayee(IPayee payee){
        if(!payees.contains(payee)){
            payees.add(payee);
        }
    }

    public void processPayments(){
        for(IPayee payee:payees){
            Double grossPayment=payee.grossPayment();
            Double tax=0.0;
            if(payee instanceof ITaxablePayee){
                Double taxableIncome=grossPayment-((ITaxablePayee)payee).allowance();
                tax=taxableIncome*taxRate;
            }
            Double netPayment=grossPayment-tax;

            System.out.println("Paying to : "+payee.name());
            System.out.println("tGrosst  : "+grossPayment);
            System.out.println("tTaxtt - "+tax);
            System.out.println("tNett "+netPayment);
            System.out.println("tTransferred to Account : "+payee.bankAccount());
        }
    }
    
}
