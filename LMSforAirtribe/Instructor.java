package LMSforAirtribe;

public class Instructor {

    private String instructorId;
    private String instructorName;
    private String instructorEmail;
    private String instructorPhone;
    private String instructorAddress;

    public Instructor(String instructorId, String instructorAddress, String instructorPhone, String instructorEmail, String instructorName) {
        this.instructorId = instructorId;
        this.instructorAddress = instructorAddress;
        this.instructorPhone = instructorPhone;
        this.instructorEmail = instructorEmail;
        this.instructorName = instructorName;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorAddress() {
        return instructorAddress;
    }

    public void setInstructorAddress(String instructorAddress) {
        this.instructorAddress = instructorAddress;
    }

    public String getInstructorPhone() {
        return instructorPhone;
    }

    public void setInstructorPhone(String instructorPhone) {
        this.instructorPhone = instructorPhone;
    }

    public String getInstructorEmail() {
        return instructorEmail;
    }

    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}
