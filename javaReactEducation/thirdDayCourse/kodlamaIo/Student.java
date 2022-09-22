package thirdDayCourse.kodlamaIo;

public class Student extends User {
    private int studentNumber;
    private int numberOfVideosWatch;
    private double courseCompletionRate;

      
    


    public int getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;       
    }
    public int getNumberOfVideosWatch() {
        return numberOfVideosWatch;
    }
    public void setNumberOfVideosWatch(int numberOfVideosWatch) {
        this.numberOfVideosWatch = numberOfVideosWatch;
    }
    public double getCourseCompletionRate(Course course) {  
        this.courseCompletionRate =(this.numberOfVideosWatch/course.getNumberOfVideo());
        return this.courseCompletionRate;
    }
    public void setCourseCompletionRate(double courseCompletionRate) {
        this.courseCompletionRate = courseCompletionRate;
    }
    public Student(int id, String firstName, String surName, String password, String email, int studentNumber) {
        super(id, firstName, surName, password, email);
        this.studentNumber=studentNumber;
    }
    
}
