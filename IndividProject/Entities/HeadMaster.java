package Entities;

public class HeadMaster {
    private String FirstName;
    private String LastName;
    private int age;
    private String gender;
    
    public HeadMaster(){
        
    }
    
    public HeadMaster(String FirstName, String LastName, int age, String gender){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "HeadMaster{"    + "FirstName=" + FirstName 
                                + ", LastName=" + LastName 
                                + ", age=" + age 
                                + ", gender=" + gender + '}';
    }
    
    
}
