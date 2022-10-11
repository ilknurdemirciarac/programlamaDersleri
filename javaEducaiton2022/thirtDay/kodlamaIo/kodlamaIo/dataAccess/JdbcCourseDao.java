package kodlamaIo.dataAccess;

import kodlamaIo.entities.Course;

public class JdbcCourseDao implements CourseDao{

    @Override
    public void add(Course course) {
        // TODO Auto-generated method stub
        System.out.println("Kurs Jdbc ile eklendi : "+ course.getCourseName());
        
    }
    
}
