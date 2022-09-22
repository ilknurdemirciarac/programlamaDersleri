package thirdDayCourse.kodlamaIo;

public class InstructorManager extends UserManager{

    @Override
    public void add(User user) {
        // TODO Auto-generated method stub
        System.out.println(user.getFirstName()+" "+user.getSurName()+" isimli eğitmen bilgileri database e eklendi");
    }

    @Override
    public void addMultiple(User[] users) {
        // TODO Auto-generated method stub
        super.addMultiple(users);
    }

    @Override
    public void delete(User user) {
        // TODO Auto-generated method stub
        System.out.println(user.getFirstName()+" "+user.getSurName()+" isimli eğitmen bilgileri database e silindi");
    }

    @Override
    public void update(User user) {
        // TODO Auto-generated method stub
        System.out.println(user.getFirstName()+" "+user.getSurName()+" isimli eğitmen bilgileri database e güncellendi");
    }

    
}
