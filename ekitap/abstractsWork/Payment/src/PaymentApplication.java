public class PaymentApplication {
    public static void main(String[] args) {
        PaymentSystem paymentSystem=new PaymentSystem();
        CommissionEmployee ilknur=new CommissionEmployee("İlknur ARAÇ", 12121,500.0,1000.0);
        paymentSystem.addPayee(ilknur);

        CommissionEmployee ada=new CommissionEmployee("Ada Kara",12415,1000.0,1000.0);
        paymentSystem.addPayee(ada);

        SalaryEmployee elif=new SalaryEmployee("Elif ARAÇ",1234,670.0,100.0);
        paymentSystem.addPayee(elif);
        SalaryEmployee ela=new SalaryEmployee("Ela ARAÇ",12674,1470.0,1000.0);
        paymentSystem.addPayee(ela);

        //similuta week
        ContractingCompany artı = new ContractingCompany("Acme Inc", 5555);
        paymentSystem.addPayee(artı);
        ContractingCompany javaCode = new ContractingCompany("javacodegeeks.com", 6666);
paymentSystem.addPayee(javaCode);

        ilknur.giveCommission(50.0);
        ilknur.giveCommission(85.0);
        ilknur.giveCommission(50.0);
        ilknur.giveCommission(85.0);

        ada.giveCommission(23.0);
        ada.giveCommission(56.0);
        ada.giveCommission(263.0);
        ada.giveCommission(343.0);

        paymentSystem.processPayments();

        System.out.println("-------------------");
        ilknur.giveCommission(450.0);
        ilknur.giveBonus(18.0);

        ada.giveCommission(60.0);
        ada.giveBonus(5.0);
        elif.giveBonus(8.0);
        ela.giveBonus(3.0);

        javaCode.payForServices(480.0);
        javaCode.payForServices(100.0);

        paymentSystem.processPayments();



    }
    
}
