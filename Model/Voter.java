public class Voter {
    private String id;
    private String name;
    private boolean active;
    private boolean hasVoted;

    public Voter(String id, String name, boolean active, boolean hasVoted) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.hasVoted = hasVoted;
    }

    public String getID() {return id;}
    public void setID(String id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public boolean isActive() {return active;}

    public boolean isVoted() { return hasVoted;}

}
