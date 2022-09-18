package firstWork;
/**
 * Course
 */
public class Course {
    int id;
    String name;
    int charge;
    String educator;
    String detail;
    public Course(){
        System.out.println("yapıcı metod çalıştı");
    }
    public Course(int id,String name,int charge,String educator,String detail){
        this();
        this.id=id;
        this.name=name;
        this.charge=charge;
        this.educator=educator;
        this.detail=detail;
    }

    
}