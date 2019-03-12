package Entities;

public class Trainer {
    private String FirstName;
    private String LastName;
    private String subject;
    
    public Trainer(){
        
    }
    
    public Trainer(String FirstName, String LastName, String subject){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    @Override
    public String toString() {
        return "Trainer{"   + "FirstName=" + FirstName
                            + ", LastName=" + LastName 
                            + ", subject=" + subject + '}';
    }
    
    
    
    
    
}
