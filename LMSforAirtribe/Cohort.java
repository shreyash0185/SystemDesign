package LMSforAirtribe;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cohort {

    private String cohortName;
    private String cohortId;
    private String cohortDescription;
    private String startDate;
    private String endDate;

    private List<Learner> learnerList;

    public List<Learner> getLearnerList() {
        return learnerList;
    }

    public void addLearner(Learner learner){
        learnerList.add(learner);
    }

    public void setLearnerList(List<Learner> learnerList) {
        this.learnerList = learnerList;
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }

    private List<Instructor> instructorList;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Cohort(String cohortName, String cohortId, String cohortDescription, String startDate, String endDate) {
        this.cohortName = cohortName;
        this.cohortId = cohortId;
        this.cohortDescription = cohortDescription;
        this.startDate=startDate;
        this.endDate=endDate;
        this.learnerList= new ArrayList<>();
         this.instructorList = new ArrayList<>();
    }

    public String getCohortName() {
        return cohortName;
    }

    public void setCohortName(String cohortName) {
        this.cohortName = cohortName;
    }

    public String getCohortId() {
        return cohortId;
    }

    public void setCohortId(String cohortId) {
        this.cohortId = cohortId;
    }

    public String getCohortDescription() {
        return cohortDescription;
    }

    public void setCohortDescription(String cohortDescription) {
        this.cohortDescription = cohortDescription;
    }


    public void displayCohortDetails(){
        System.out.println("Cohort Id "+cohortId);
        System.out.println("Cohort Name "+cohortName);
        System.out.println("Cohort Description "+cohortDescription);
        System.out.println("Cohort Start Date "+startDate);
        System.out.println("Cohort End Date "+endDate);

        System.out.println("Instructor List "+instructorList);
        System.out.println("Learner List "+learnerList);

    }




}
