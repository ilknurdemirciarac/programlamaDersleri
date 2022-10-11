package interfaces;

public class MysqlCustomerDal implements ICustomerDal,IRepository{

    @Override
    public void add() {
        System.out.println("My Sql Eklendi.");
        
    }

    @Override
    public void update() {
        System.out.println("My Sql güncellendi.");
        
    }
    
}
