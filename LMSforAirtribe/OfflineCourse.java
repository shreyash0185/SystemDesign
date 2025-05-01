package LMSforAirtribe;

public class OfflineCourse extends Course{


    private String location;


    public OfflineCourse(String courseName, String courseId, String courseDescription, CourseLanguage courseLanguage,String locaion) {
        super(courseName, courseId, courseDescription, courseLanguage);
        this.location = locaion;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Course ID: " + getCourseId());
        System.out.println("Course Description: " + getCourseDescription());
        System.out.println("Course Language: " + getCourseLanguage());
        System.out.println("Location: " + getLocation());
    }
}
