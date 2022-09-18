package firstWork;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Kodlama.io");

        Course course1=new Course();
        course1.id=1;
        course1.name="JAVA";
        course1.charge=100;
        course1.detail="2022 yılı JAVA React kursu";
        course1.educator="İlknur";

        Course course2=new Course(2,"C#",180,"Emel","C# başlangıç eğitimi");

        Category category=new Category();
        category.id=1;
        category.name="Programlama";
        
        CourseManager courseManager=new CourseManager();
        courseManager.courseAdd(course1);
        courseManager.enrollCourse();
        courseManager.courseAdd(course2);



    }
}
