package LMSforAirtribe;

public class NodeLearner extends Learner{


    private int noOfExp ;

    public NodeLearner(String learnerId, String learnerName, String learnerEmail, int noOfExp) {
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

    }
}
