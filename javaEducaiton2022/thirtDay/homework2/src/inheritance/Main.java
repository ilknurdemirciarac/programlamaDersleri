package inheritance;

public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer();
        Employee employee=new Employee();
        customer.age=16;
        employee.firstName="İlknur";
        
        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager=new CustomerManager();
        employeeManager.add();
        customerManager.list();
        
    }
    
}
