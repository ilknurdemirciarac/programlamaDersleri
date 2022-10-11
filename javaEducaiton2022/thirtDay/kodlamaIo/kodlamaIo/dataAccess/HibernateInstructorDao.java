package kodlamaIo.dataAccess;

import kodlamaIo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
        // TODO Auto-generated method stub
        System.out.println("Eğitmen Hibernate ile eklendi : "+ instructor.getFirstName());
        
    }
    
}