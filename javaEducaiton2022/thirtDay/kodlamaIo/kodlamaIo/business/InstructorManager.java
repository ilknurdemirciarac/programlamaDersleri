package kodlamaIo.business;

import java.util.ArrayList;
import kodlamaI.logging.BaseLogger;
import kodlamaIo.dataAccess.InstructorDao;
import kodlamaIo.entities.Instructor;

public class InstructorManager implements InstructorDao{

    private InstructorDao instructorDao;
    private BaseLogger[] loggers;
    private ArrayList<String> instructorName=new ArrayList<>();

    public InstructorManager(InstructorDao instructorDao,BaseLogger[] loggers){
        this.instructorDao=instructorDao;
        this.loggers=loggers;

    }

    @Override
    public void add(Instructor instructor) {
        
        if(instructorName.size()==0){
            instructorName.add(instructor.getFirstName());
            instructorDao.add(instructor);

            for(BaseLogger logger:loggers){
                logger.log(instructor.getFirstName());

            }

        }else{
            for(String name:instructorName){
                if(name.equals(instructor.getFirstName())){
                    System.out.println("Eğitmen kayıtlı : "+instructor.getFirstName());
                    break;
                }
                else{
                    instructorDao.add(instructor);
                    for(BaseLogger logger:loggers){
                        logger.log(instructor.getFirstName());
                    }
                }

            }

        }

        
    

    }
}
