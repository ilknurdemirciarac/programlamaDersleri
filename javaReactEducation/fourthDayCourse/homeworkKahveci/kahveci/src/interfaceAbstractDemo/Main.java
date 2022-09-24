package interfaceAbstractDemo;

import java.rmi.RemoteException;
import java.time.LocalDate;

import interfaceAbstractDemo.Abstract.CustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCostumerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main{
    public static void main(String[] args) throws NumberFormatException,RemoteException{

        CustomerManager customerManager=new CustomerManager();
        //StarbucksCostumerManager(new mernisServiceAdapter());
        customerManager.save(new Customer(1+ "İlknur"+"Araç"+LocalDate.of(1994,2 ,4)+"12121212121"));
        
    }
}