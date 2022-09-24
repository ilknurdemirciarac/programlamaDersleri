package interfaceAbstractDemo.Abstract;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Entities.Customer;

public interface ICustomerCheckService {
    boolean checkIfRealPerson(Customer customer) throws NumberFormatException,RemoteException;
    
}
