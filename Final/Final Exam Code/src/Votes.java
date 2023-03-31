public class Votes {
    private String candidate;
    private int votes;

    public Votes(String candidate, int votes) {
        this.candidate = candidate;
        this.votes = votes;
    }
    
    public Votes(){
        
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Votes{" + "candidate=" + candidate + ", votes=" + votes + '}';
    }
    
    
    
    
}
