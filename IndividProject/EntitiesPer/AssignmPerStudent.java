package EntitiesPer;

import Entities.Assignment;
import Entities.Student;
import java.util.ArrayList;

public class AssignmPerStudent {
    private Student student;
    private ArrayList <Assignment> assignments;
    private int studentsMark;

    public AssignmPerStudent(Student student, ArrayList<Assignment> assignments, int studentsMark) {
        this.student = student;
        this.assignments = assignments;
        this.studentsMark = studentsMark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ArrayList <Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList <Assignment> assignments) {
        this.assignments = assignments;
    }

    public int getStudentsMark() {
        return studentsMark;
    }

    public void setStudentsMark(int studentsMark) {
        this.studentsMark = studentsMark;
    }
    
    
    
}
