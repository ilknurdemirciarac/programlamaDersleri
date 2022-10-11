package kodlamaIo.business;

import java.util.ArrayList;


import kodlamaIo.dataAccess.CourseDao;
import kodlamaIo.entities.Course;
import kodlamaIo.logging.BaseLogger;

public class CourseManager {
    private CourseDao courseDao;
    private BaseLogger[] loggers;
    private ArrayList<String> courseNames=new ArrayList<>();

    public CourseManager(CourseDao courseDao,BaseLogger[] loggers)
    {
        this.courseDao=courseDao;
        this.loggers=loggers;
    }

    public void add(Course course){
        if(courseNames.size()==0){
            courseNames.add(course.getCourseName());
            courseDao.add(course);
            for(BaseLogger logger:loggers){
                logger.log(course.getCourseName());
            }

        }
        else{
            courseDao.add(course);
            for(BaseLogger logger:loggers){
                logger.log(course.getCourseName());
            }
            for(String c:courseNames){
                if(c.equals(course.getCourseName())){
                    System.out.println("Bu kurs ismi mevcut : "+ c);
                    
                }
                else{
                    courseDao.add(course);
                    for(BaseLogger logger:loggers){
                        logger.log(course.getCourseName());

                    }
                }
            }
        }

    }
    
}
