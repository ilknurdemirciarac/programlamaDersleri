package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        // TODO Auto-generated method stub
        return true;    }
    

    
}
