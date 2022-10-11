package kodlamaIo.business;

import java.util.ArrayList;

import kodlamaIo.dataAccess.StudentDao;
import kodlamaIo.entities.Student;
import kodlamaIo.logging.BaseLogger;


public class StudentManager implements StudentDao {

        private StudentDao studentDao;
        private BaseLogger[] loggers;
        private ArrayList<String> studentNames=new ArrayList<>();
    
        public StudentManager(StudentDao studentDao,BaseLogger[] loggers)
        {
            this.studentDao=studentDao;
            this.loggers=loggers;
        }
    
        
        
    

    @Override
    public void add(Student student) {
        if(studentNames.size()==0){
            studentNames.add(student.getFirstName());
            studentDao.add(student);
            for(BaseLogger logger:loggers){
                logger.log(student.getFirstName());
            }

        }
        else{
            studentDao.add(student);
            for(BaseLogger logger:loggers){
                logger.log(student.getFirstName());
            }
            for(String s:studentNames){
                if(s.equals(student.getFirstName())){
                    System.out.println("Bu Öğrenci ismi mevcut : "+ s);
                    
                }
                else{
                    studentDao.add(student);
                    for(BaseLogger logger:loggers){
                        logger.log(student.getFirstName());

                    }
                }
            }
        }
        
    }

    
    

    
}
