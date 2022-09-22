package thirdDayCourse.kodlamaIo;

public class StudentManager extends UserManager {

    @Override
    public void add(User user) {
        // TODO Auto-generated method stub
        System.out.println(user.getFirstName()+" "+user.getSurName()+" isimli öğrenci bilgileri database e eklendi");
    }

    @Override
    public void addMultiple(User[] users) {
        // TODO Auto-generated method stub
        super.addMultiple(users);
    }

    @Override
    public void delete(User user) {
        // TODO Auto-generated method stub
        System.out.println(user.getFirstName()+" "+user.getSurName()+" isimli öğrenci bilgileri database e silindi");
    }

    @Override
    public void update(User user) {
        // TODO Auto-generated method stub
        System.out.println(user.getFirstName()+" "+user.getSurName()+" isimli öğrenci bilgileri database e güncellendi");
    }
    public void registorCourse(Student student){
        System.out.println(student.getFirstName()+" "+student.getSurName()+" isimli öğrenci Kurs tanımlandı");
    }

    
}
