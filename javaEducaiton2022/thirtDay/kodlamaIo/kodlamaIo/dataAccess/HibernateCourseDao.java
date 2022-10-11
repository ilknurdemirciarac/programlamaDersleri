package kodlamaIo.dataAccess;

import kodlamaIo.entities.Course;

public class HibernateCourseDao implements CourseDao{

    @Override
    public void add(Course course) {
        // TODO Auto-generated method stub
        System.out.println("Kurs Hibernate ile eklendi : "+ course.getCourseName());
        
    }

    
}
