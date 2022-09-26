/*public class SalaryEmployee implements IPayee {

  private String name;
    private Integer bankAccount;
    protected Double grossWage;
    public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.grossWage = grossWage;
    }
    public Integer bankAccount(){
        return bankAccount;
    }
    public String name(){
        return name;
    }
    public Double grossPayment(){
        return grossWage;
    }    
    
}*/

public class SalaryEmployee extends Employee{
    

    public SalaryEmployee(String name, Integer bankAccount, Double grossWage, Double allowance) {
        super(name, bankAccount, grossWage, allowance);
    }
    
    @Override
    public Double grossPayment(){
        //return grossWage;
        return grossWage+doCurrentBonus();
    }
    @Override
    public void giveBonus(Double percentage){
        currentBonus+=grossWage*(percentage/100.0);
    }
}
