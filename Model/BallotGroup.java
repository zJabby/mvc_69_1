import java.util.ArrayList;
import java.util.List;
public class BallotGroup {
    private String pattern;
    private List<Ballot> ballots;
    private GroupStatus status;

    public BallotGroup(String pattern) {
        this.pattern = pattern;
        ballots = new ArrayList<>();
        status = GroupStatus.PENDING;
    }
}
