package inheritance;
public class Main {
    public static void main(String[] args) {
        IndividualCustomer ilknur=new IndividualCustomer();
        CorporateCustomer hepsiburada=new CorporateCustomer();

        ilknur.setCustomerNumber("12345");
        hepsiburada.setCompanyName("Hepsi Burada");
        hepsiburada.setCustomerNumber("11111");
        CustomerManager customerManager=new CustomerManager();
        customerManager.add(ilknur);
        customerManager.add(hepsiburada);
        customerManager.update(ilknur);

        SendikaCustomer sendika=new SendikaCustomer();
        sendika.setCustomerNumber("123123");

        Customer[] customers={ilknur,hepsiburada,sendika};
        customerManager.addMultiple(customers);

    }
    
}
