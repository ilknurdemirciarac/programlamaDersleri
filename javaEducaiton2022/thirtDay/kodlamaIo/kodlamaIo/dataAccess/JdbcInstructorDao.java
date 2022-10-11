package kodlamaIo.dataAccess;

import kodlamaIo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
        // TODO Auto-generated method stub
        System.out.println("Eğitmen Jdbc ile eklendi : "+ instructor.getFirstName());        
    }

    
    
}
