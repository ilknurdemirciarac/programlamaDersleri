package inheritance;

public class IndividualCustomer extends Customer {
    private String firstName;
    private String surName;
    private String nationalyName;
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
    public String getNationalyName() {
        return nationalyName;
    }
    public void setNationalyName(String nationalyName) {
        this.nationalyName = nationalyName;
    }  
    
}
