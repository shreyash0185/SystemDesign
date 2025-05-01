package LMSforAirtribe;

public class JavaLearner extends Learner{


    private int noOfExp ;

    public JavaLearner(String learnerId, String learnerName, String learnerEmail, int noOfExp) {
        super(learnerId, learnerName, learnerEmail);
        this.noOfExp = noOfExp;
    }

    public int getNoOfExp() {
        return noOfExp;
    }

    public void setNoOfExp(int noOfExp) {
        this.noOfExp = noOfExp;
    }

    @Override
    public void displayLearnerDetails() {
        System.out.println("Learner ID: " + getLearnerId());
    }
}
