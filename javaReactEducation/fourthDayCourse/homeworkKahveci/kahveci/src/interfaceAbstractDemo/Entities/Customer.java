package interfaceAbstractDemo.Entities;


import java.time.LocalDate;

public class Customer {
    private int _id;
    private String _firstName;
    private String _lastName;
    private LocalDate _dateOfYear;
    private String _nationalityId;
    public int id() {
        return _id;
    }
    public void id(int id) {
        this._id = id;
    }
    public String firstName() {
        return _firstName;
    }
    public void firstName(String firstName) {
        this._firstName = firstName;
    }
    public String lastName() {
        return _lastName;
    }
    public void lastName(String lastName) {
        this._lastName = lastName;
    }
    public LocalDate dateOfYear() {
        return _dateOfYear;
    }
    public void dateOfYear(LocalDate dateOfYear) {
        this._dateOfYear = dateOfYear;
    }
    public String nationalityId() {
        return _nationalityId;
    }
    public void nationalityId(String nationalityId) {
        this._nationalityId = nationalityId;
    }
    public Customer(int id, String firstName, String lastName,LocalDate dateOfYear,  String nationalityId) {
        this._id = id;
        this._firstName = firstName;
        this._lastName = lastName;
        this._dateOfYear = dateOfYear;
        this._nationalityId = nationalityId;
    }

   
    


}
