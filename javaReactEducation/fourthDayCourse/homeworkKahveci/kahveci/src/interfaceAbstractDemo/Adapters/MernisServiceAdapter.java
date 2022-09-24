package interfaceAbstractDemo.Adapters;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
        // TODO Auto-generated method stub
        KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		return kpsPublic.TCKimlikNoDogrula(customer.nationalityId, customer.firstName, customer.lastName, customer.dateOfBirth.getYear());
    }

    
}
