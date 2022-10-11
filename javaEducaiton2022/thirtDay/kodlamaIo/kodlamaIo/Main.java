package kodlamaIo;

import kodlamaI.logging.BaseLogger;
import kodlamaI.logging.DataBaseLogger;
import kodlamaI.logging.EmailLogger;
import kodlamaI.logging.FileLogger;
import kodlamaIo.business.CourseManager;
import kodlamaIo.business.InstructorManager;
import kodlamaIo.business.UserManager;
import kodlamaIo.dataAccess.HibernateInstructorDao;
import kodlamaIo.dataAccess.JdbcCourseDao;
import kodlamaIo.entities.Course;
import kodlamaIo.entities.Instructor;
import kodlamaIo.entities.Student;
import kodlamaIo.entities.User;

public class Main {
    public static void main(String[] args) {

        BaseLogger[] loggers={new DataBaseLogger(),new EmailLogger(),new FileLogger()};

        CourseManager courseManager=new CourseManager(new JdbcCourseDao(), loggers);

        



        Student student1 = new Student(1,"ada","kara","1234","asfa@vc",5);
        Student student2 = new Student(2, "Elmas", "Kara", "123446", "email1@hotmail.com",6);
       

        Instructor instructor1 = new Instructor(1, "İbrahim", "Demirci", "1425326", "emaile@gmail.com", "C# eğitmeni");
        Instructor instructor2 = new Instructor(2, "İsmail", "Demir", "1421326", "emailek@gmail.com", "Java eğitmeni");

        User[] studentUsers = { student1, student2 };
        User[] instructorUsers = { instructor1, instructor2 };

        System.out.println("************* 1 ************************");
        for (User user : instructorUsers) {
            System.out.println(
                    user.getId() + " : " + user.getFirstName() + " : " + user.getSurName() + " : " + user.getEmail());

        }
        System.out.println("************* 2 ************************");
        for (User user : studentUsers) {
            System.out.println(
                    user.getId() + " : " + user.getFirstName() + " : " + user.getSurName() + " : " + user.getEmail());
        }
        
        System.out.println("************* 3 ************************");
        InstructorManager manager = new InstructorManager(new HibernateInstructorDao(), loggers);
        manager.add(instructor1);
        System.out.println("************* 4 ************************");

        System.out.println(student1.getStudentNumber());
        System.out.println(student2.getStudentNumber());

        Course course1 = new Course(1, "Yazılım Geliştirme", "Java");
        Course course2 = new Course(2, "Yazılım Geliştirme", "C#");
        course1.setNumberOfVideo(50);
        course2.setNumberOfVideo(100);
        student1.setNumberOfVideosWatch(25);
        System.out.println("************* 5 ************************");
        System.out.println("Kurs tamamlama oranı " + student1.getCourseCompletionRate(course1));

    }

}
