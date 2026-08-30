public class Ballot {
    private String id;
    private String voterId;
    private String rank1;
    private String rank2;
    private String rank3;
    private BallotStatus status;

    public Ballot(String id, String voterId, String rank1, String rank2, String rank3) {
        this.id = id;
        this.voterId = voterId;
        this.rank1 = rank1;
        this.rank2 = rank2;
        this.rank3 = rank3;
        status = BallotStatus.RECORDED;

    }
    public String getID() {return id;}
    public void setId(String id) {this.id = id;}

    public String getVoterId() {return voterId;}
    public void setVoterId(String voterId) {this.voterId = voterId;}

    public String getRank1() {return rank1;}
    public String getRank2() {return rank2;}
    public String getRank3() {return rank3;}

    public String getPattern() {
        return rank1 + ">" + rank2 + ">" + rank3;
    }
}
