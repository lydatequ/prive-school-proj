package EntitiesPer;

import Entities.Assignment;
import Entities.Course;
import java.util.ArrayList;

public class AssignmPerCourse {
    private Course course;
    private ArrayList <Assignment> assignments;

    public AssignmPerCourse(Course course, ArrayList<Assignment> assignments) {
        this.course = course;
        this.assignments = assignments;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList <Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList <Assignment> assignments) {
        this.assignments = assignments;
    }
    
    
    
    
}
