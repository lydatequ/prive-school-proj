package EntitiesPer;

import Entities.Course;
import Entities.Trainer;
import java.util.ArrayList;

public class TrainersPerCourse {
    private Course course;
    private ArrayList <Trainer> trainers;

    public TrainersPerCourse(Course course, ArrayList<Trainer> trainers) {
        this.course = course;
        this.trainers = trainers;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList <Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(ArrayList <Trainer> trainers) {
        this.trainers = trainers;
    }

    @Override
    public String toString() {
        return "TrainersPerCourse{" + "course=" + course 
                                    + ", trainers=" + trainers + '}';
    }
    
    
    
}
