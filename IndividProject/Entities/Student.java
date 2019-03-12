package Entities;

public class Student {
    private String FirstName;
    private String LastName;
    private String dateOfBirth;
    private double tuitionFees;
    
    public Student(){
        
    }
    
    public Student(String FirstName, String LastName, String dateOfBirth, double tuitionFees){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{"   + "FirstName=" + FirstName 
                            + ", LastName=" + LastName 
                            + ", dateOfBirth=" + dateOfBirth   
                            + ", tuitionFees=" + tuitionFees + '}';
    }
    
    
    
}
