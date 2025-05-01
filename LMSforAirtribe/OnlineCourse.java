package LMSforAirtribe;

public class OnlineCourse extends Course{

    private String zoomUrl;

    public String getZoomUrl() {
        return zoomUrl;
    }

    public void setZoomUrl(String zoomUrl) {
        this.zoomUrl = zoomUrl;
    }

    public OnlineCourse(String courseName, String courseId, String courseDescription, CourseLanguage courseLanguage , String zoomUrl) {
        super(courseName, courseId, courseDescription, courseLanguage);
        this.zoomUrl = zoomUrl;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Course ID: " + getCourseId());
        System.out.println("Course Description: " + getCourseDescription());
        System.out.println("Course Language: " + getCourseLanguage());
        System.out.println("Url: " + getZoomUrl());

        System.out.println("Cohorts: ");
        for (Cohort cohort : getCohorts()) {
            System.out.println("Cohort Name: " + cohort.getCohortName());
            System.out.println("Cohort ID: " + cohort.getCohortId());
            System.out.println("Cohort Start Date: " + cohort.getStartDate());
            System.out.println("Cohort End Date: " + cohort.getEndDate());
        }





    }
    public void setCourseName(String courseName) {
        super.setCourseName(courseName);
    }

}
