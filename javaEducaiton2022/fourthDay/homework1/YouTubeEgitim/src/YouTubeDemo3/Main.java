package YouTubeDemo3;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        CreditManager creditManager=new CreditManager();
        //creditManager.calculate();
        creditManager.save();

        Customer customer=new Customer();//örneğini oluşturmak, instance oluşturmak, instance creation
        customer.Id=1;
       
        

        CustomerManager customerManager=new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.save();
        customerManager.delete();
        customerManager.giveCredit();


        Company company=new Company();
        company.taxNumber="1002000";
        company.companyName="ARçelik";
        company.Id=100;
        
        CustomerManager customerManager2=new CustomerManager(new Person(),new TeacherCreditManager());
        customerManager2.save();
        customerManager2.giveCredit();



        Person person=new Person();
        person.FirstName="Ada";
        person.LastName="ARAÇ";
        person.City="samsun";
        person.NationalyIdentity="111111111121";


        //Customer c1=new Customer();
        //Customer c2=new Person();
       // Customer c3=new Company();

        System.out.println();

    }
    
}
class CreditManager{


    public void calculate(int creditType){
        //sonar gube
        if(creditType==1){//esnaf

        }
        if(creditType==2){//öğretmen

        }
        System.out.println("Hesaplandı");
    }
    public void save(){
        System.out.println("Kredi verildi");
    }
}


interface ICreditManager{
    void calculate();
    void save();
}

abstract class BaseCreditManager implements ICreditManager{
    public abstract void calculate(); //tamamlanmamış

    public void save() {//tamamlanmış
        System.out.println("Kaydedildi");
        
    }

}
class TeacherCreditManager extends BaseCreditManager{

    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı");
        
    }    

}
class MilitaryCreditManager extends BaseCreditManager{

    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandı");
        
    }
    
}

//SOLID
class Customer
{
    public int Id;
    
    public String City;
    

    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public Customer() {
        System.out.println("müşteri nesnesi başlatıldı");
    }
   
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    
    
}
class Person extends Customer{
    public String NationalyIdentity;
    public String FirstName;
    public String LastName;

    public String getNationalyIdentity() {
        return NationalyIdentity;
    }
    public void setNationalyIdentity(String nationalyIdentity) {
        NationalyIdentity = nationalyIdentity;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }

}

class Company extends Customer{//şirket müsteri nesnesinden inherit oluyor
    public String taxNumber;
    public String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
    
}

//Katmanlı mimariler

class CustomerManager{
    private Customer _customer;
    private ICreditManager _creditManager;
    
    public CustomerManager(Customer customer,ICreditManager creditManager){
        _customer=customer;
        _creditManager=creditManager;

    }
    public void save() {

        System.out.println("Müşteri eklendi ");
    }
    public void delete() {

        System.out.println("Müşteri silindi ");
    }
    public void giveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi verildi");
        _creditManager.save();
        

    }
    
}

