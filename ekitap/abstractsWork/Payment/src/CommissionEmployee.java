/*public class CommissionEmployee implements IPayee{
    private String name;
    private Integer bankAccount;
    protected Double grossWage;
    private Double grossCommission=0.0;
    public CommissionEmployee(String name, Integer bankAccount, Double grossWage) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.grossWage = grossWage;
    }
    public String name() {
        return name;
    }
    public Integer bankAccount() {
        return bankAccount;
    }
    public Double grossPayment() {
        return grossWage+doCurrentCommission();
    }
    public Double doCurrentCommission() {
        Double commission=grossCommission;
        grossCommission=0.0;
        return commission;
    }
    public void giveCommission(Double amount){
        grossCommission+=amount;
    }   
    
}*/


public class CommissionEmployee extends Employee{
    private static final Double bonusMultiplier=1.5;
    private Double grossCommission=0.0;

      
    public CommissionEmployee(String name, Integer bankAccount, Double grossWage, Double allowance) {
        super(name, bankAccount, grossWage, allowance);
    }
    
    private Double doCurrentCommission(){
        Double commission = grossCommission;
        grossCommission = 0.0;
        return commission;
    }
    
    public void giveCommission(Double amount){
        grossCommission+=amount;
    }
    @Override
    public void giveBonus(Double percentage){
        currentBonus+=grossWage*(percentage/100.0)*bonusMultiplier;
    }
    @Override
    public Double grossPayment(){
        return grossWage+doCurrentBonus()+doCurrentCommission();
    }

}
