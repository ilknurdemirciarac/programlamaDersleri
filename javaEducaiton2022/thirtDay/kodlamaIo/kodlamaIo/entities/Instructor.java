package kodlamaIo.entities;

public class Instructor extends User{
    private String detail;

    public Instructor(int id, String firstName, String surName, String password, String email, String detail) {
        super(id, firstName, surName, password, email);
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    
}
