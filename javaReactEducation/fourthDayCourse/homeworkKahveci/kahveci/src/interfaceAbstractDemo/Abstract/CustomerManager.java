package interfaceAbstractDemo.Abstract;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public class CustomerManager implements ICustomerService {
    //base class
    @Override
    public void save(Customer customer) throws NumberFormatException,RemoteException{
        System.out.println("Veritabanına kaydedildi : "+customer.firstName());
    }
    
}
