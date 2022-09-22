package Interfaces;
public class Main {
    public static void main(String[] args) {
        //interface ler class oalrak kabul edilmez İmza taşırlar
        //class birden fazla İnterface i implement edebilir
        //class sadece bir classı extend edebilir
        //ICustomerDal customerDal=new ICustomerDal(); //bu şekilde kulanılamaz

        ICustomerDal customerDal=new MysqlCustomerDal();
        customerDal.Add();
        ICustomerDal customerDal1=new OracleCustomerDal();
        customerDal1.Add();

        //CustomerManager customerManager=new CustomerManager();//interface new olmaz
       // customerManager.customerDal=new OracleCustomerDal();
       CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());//polymorphism interface ile kullanma
       customerManager.add();
        //CustomerManager customerManager1=new CustomerManager();//interface new olmaz
        //customerManager1.customerDal=new MysqlCustomerDal();
        //customerManager1.add();


    }
}
