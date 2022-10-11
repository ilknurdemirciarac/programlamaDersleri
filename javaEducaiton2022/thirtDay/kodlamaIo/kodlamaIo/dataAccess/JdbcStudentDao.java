package kodlamaIo.dataAccess;

import kodlamaIo.entities.Student;

public class JdbcStudentDao implements StudentDao {

    @Override
    public void add(Student student) {
        // TODO Auto-generated method stub
        System.out.println("Öğrenci Jdbc ile eklendi : "+ student.getFirstName());
        
    }

    
}
