package interfaceAbstractDemo.Concrete;

public class StarbucksCostumerManager extends CustomerManager{

    private ICustomerCheckService _customerCheckService;

    public StarbucksCostumerManager(ICustomerCheckService _customerCheckService) {
        this._customerCheckService = _customerCheckService;
    }

    @Override
    public void save(Customer customer) throws NumberFormatException,RemoteException{
        
        if (_customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println("Geçerli bir kişi değil");
        }
    }

    

}
