package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.IUserDao;
import entities.concretes.User;

public class HibernateUserDao implements IUserDao{
    List<User> users=new ArrayList<>();

    @Override
    public void add(User user) {
        System.out.println("Save to database with hibernate: " + user.getFirstName());
        users.add(user);
        
    }

    @Override
    public void update(User user) {
        System.out.println("Update to database with hibernate: " + user.getFirstName());
        
   
        
    }

    @Override
    public void delete(User user) {
        System.out.println("Delte to database with hibernate: " + user.getFirstName());
        
        
    }

    @Override
    public User get(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> getUsers() {
        // TODO Auto-generated method stub
        return users;
    }
    public void setUsers(List<User> users){
        this.users=users;
    }

    
    
    
}
