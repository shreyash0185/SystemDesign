package LMSforAirtribe;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    Course JavaOfflineCourse = new OfflineCourse("Java Offline Course", "CO123", "This is a Java course", CourseLanguage.JAVA, "https://zoom.us/j/123456789");
    Course JavaOnlineCourse = new OnlineCourse("Java Online Course", "CO124", "This is a Java course", CourseLanguage.JAVA, "Banglor");
    Course NodeOfflineCourse = new OfflineCourse("Node Offline Course", "CO125", "This is a Node course", CourseLanguage.NODE, "https://zoom.us/j/123456789");
    Course NodeOnlineCourse = new OnlineCourse("Node Online Course", "CO126", "This is a Node course", CourseLanguage.NODE, "Banglor");

    Cohort c1 = new Cohort("Cohort 1", "CO123", "This is cohort 1", "2023-10-01", "2023-12-01");

    Cohort c2 = new Cohort("Cohort 2", "CO124", "This is cohort 2", "2023-10-01", "2023-12-01");

    Cohort c3 = new Cohort("Cohort 3", "CO125", "This is cohort 3", "2023-10-01", "2023-12-01");

    Cohort c4 = new Cohort("Cohort 4", "CO126", "This is cohort 4", "2023-10-01", "2023-12-01");

    JavaOfflineCourse.addCohort(c1);

    Learner javaLearner1 = new JavaLearner("1","Java Learner","xya",2);
        Learner javaLearner2 = new JavaLearner("2","Java Learner","xya",2);

        c1.addLearner(javaLearner1);
        c1.addLearner(javaLearner2);

        Instructor instructor1 = new Instructor("1","Instructor 1" ,"232434" ,"see","Inst 1");


//    Single responsibility printciple

    }

}
