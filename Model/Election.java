import java.util.ArrayList;
import java.util.List;
public class Election {
    private ElectionStatus status;
    private List<Candidate> candidates;
    private List<Voter> voters;
    private List<Ballot> ballots;
    private List<BallotGroup> ballotGroups;

    public Election() {
        candidates = new ArrayList<>();
        voters = new ArrayList<>();
        ballots = new ArrayList<>();
        ballotGroups = new ArrayList<>();
        status = ElectionStatus.OPEN;
    }

    public void vote() {

    }
    public void close() {
        status = ElectionStatus.REVIEW;

    }
    public void open() {
        status = ElectionStatus.OPEN;

    }
    public void approveGroup() {

    }
    public void rejectGroup() {

    }
    public void getPendingGroup() {

    }
    public void getApproveCount(){

    }
    public void getRejectCount() {

    }
    public void calculateScores() {
        
    }
}
