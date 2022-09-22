package gameHomework;


public class Member extends MemberManager{
    private int id;
    private String firstName;
    private String surName;
    private int dateOfBirth;
    private Long nationalityId;
    
    public int getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
   
    public Long getNationalityId() {
        return nationalityId;
    }
    public void setNationalityId(Long nationalityId) {
        
        this.nationalityId = nationalityId;
    }

    public void member(int id,String firstName,String surName,int dateOfBirth,Long nationalityId){
        setId(id);
        setFirstName(firstName);
        setSurName(surName);
        setDateOfBirth(dateOfBirth);
        setNationalityId(nationalityId);

    }

    
}