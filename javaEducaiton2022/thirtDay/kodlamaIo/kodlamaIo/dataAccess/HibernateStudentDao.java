package kodlamaIo.dataAccess;

import kodlamaIo.entities.Student;

public class HibernateStudentDao implements StudentDao{

    @Override
    public void add(Student student) {
        // TODO Auto-generated method stub
        System.out.println("Öğrenci Hibernate ile eklendi : "+ student.getFirstName());
        
    }
    
}
