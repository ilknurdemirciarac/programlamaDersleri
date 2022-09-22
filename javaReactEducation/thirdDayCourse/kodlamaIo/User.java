package thirdDayCourse.kodlamaIo;

public class User {
    private int id;
    private String firstName;
    private String surName;
    private String password;
    private String email;
    
    public User(int id, String firstName, String surName, String password, String email) {
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
        this.password = password;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
