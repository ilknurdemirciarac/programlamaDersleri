package inheritance;

public class CustomerManager {
    //yönetecek operasyonlar burada metodlar burada iş kuralları

    public void add(IndividualCustomer customer){
        System.out.println(customer.getCustomerNumber()+" kaydedildi");
    }
    public void add(Customer customer){
        System.out.println(customer.getCustomerNumber()+" kaydedildi");
    }
    public void addMultiple(Customer[] customers){
        for (Customer customer:customers) {
            add(customer);
            
        }
    }
    public void add(CorporateCustomer customer){
        System.out.println(customer.getCustomerNumber()+" kaydedildi");
    }
    public void update(IndividualCustomer customer){
        System.out.println(customer.getCustomerNumber()+" güncellendi");
    }
    public void update(CorporateCustomer customer){
        System.out.println(customer.getCustomerNumber()+" güncellendi");
    }
    public void delete(IndividualCustomer customer){
        System.out.println(customer.getCustomerNumber()+" silindi");
    }
    public void delete(CorporateCustomer customer){
        System.out.println(customer.getCustomerNumber()+" silindi");
    }
    
}
