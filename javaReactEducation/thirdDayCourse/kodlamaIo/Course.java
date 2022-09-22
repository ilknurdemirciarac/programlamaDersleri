package thirdDayCourse.kodlamaIo;

public class Course {
    private int id;
    private String courseName;
    private String courseLanguage;
    private boolean isSubtitle;
    private double discountRate;
    private int numberOfVideo;
    private int numberOfRegisteredStudent;
    
    public Course(int id, String courseName, String courseLanguage) {
        this.id = id;
        this.courseName = courseName;
        this.courseLanguage = courseLanguage;
        
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseLanguage() {
        return courseLanguage;
    }
    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }
    public boolean isSubtitle() {
        return isSubtitle;
    }
    public void setSubtitle(boolean isSubtitle) {
        this.isSubtitle = isSubtitle;
    }
    public double getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    public int getNumberOfVideo() {
        return numberOfVideo;
    }
    public void setNumberOfVideo(int numberOfVideo) {
        this.numberOfVideo = numberOfVideo;
    }
    public int getNumberOfRegisteredStudent() {
        return numberOfRegisteredStudent;
    }
    public void setNumberOfRegisteredStudent(int numberOfRegisteredStudent) {
        this.numberOfRegisteredStudent = numberOfRegisteredStudent;
    }
    
}
