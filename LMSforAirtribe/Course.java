package LMSforAirtribe;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    public String courseName;

    public String courseId;

    public String courseDescription;

    public CourseLanguage courseLanguage;

    public List<Cohort> cohorts;

    public List<Cohort> getCohorts() {
        return cohorts;
    }

    public void setCohorts(List<Cohort> cohorts) {
        this.cohorts = cohorts;
    }

    public Course(String courseName, String courseId, String courseDescription, CourseLanguage courseLanguage) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseDescription = courseDescription;
        this.courseLanguage = courseLanguage;
        this.cohorts = new ArrayList<>();

    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public CourseLanguage getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(CourseLanguage courseLanguage) {
        this.courseLanguage = courseLanguage;
    }

    public abstract void displayCourseDetails();

    public void addCohort(Cohort cohort) {
        cohorts.add(cohort);
    }

    public void removeCohort(Cohort cohort) {
        cohorts.remove(cohort);
    }

    //We are not intialize the Corse any more as it has classees to intialize so no need for this class as concerate make this as abstract
}
