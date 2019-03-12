package Entities;

/**
 *
 * @author Lyda
 */
public class Assignment {
    private String title;
    private String description;
    private String subDateAndTime;
    private int oralMark;
    private int totalMark;
    private int studentsMark;
    
    public Assignment(){
        
    }
    
    public Assignment(String title, String description, String subDateAndTime, int oralMark, int totalMark, int studentsMark) {
        this.title = title;
        this.description = description;
        this.subDateAndTime = subDateAndTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
        this.studentsMark = studentsMark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubDateAndTime() {
        return subDateAndTime;
    }

    public void setSubDateAndTime(String subDateAndTime) {
        this.subDateAndTime = subDateAndTime;
    }

    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public int getStudentsMark() {
        return studentsMark;
    }

    public void setStudentsMark(int studentsMark) {
        this.studentsMark = studentsMark;
    }

    @Override
    public String toString() {
        return "Assignment{"    + "title=" + title 
                                + ", description=" + description 
                                + ", subDateAndTime=" + subDateAndTime 
                                + ", oralMark=" + oralMark 
                                + ", totalMark=" + totalMark 
                                + ", studentsMark=" + studentsMark + '}';
    }
    
    
    
    
}
