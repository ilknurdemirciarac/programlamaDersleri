package interfaceAbstractDemo.Abstract;

import java.rmi.RemoteException;
import java.util.function.BinaryOperator;

import interfaceAbstractDemo.Entities.Customer;

public interface ICustomerService {
    void save(Customer customer) throws NumberFormatException,RemoteException;
    
}
