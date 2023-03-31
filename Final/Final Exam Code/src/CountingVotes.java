import java.util.*;

public class CountingVotes extends Votes{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Votes> votes = enterVotes();
        ArrayList<Double> percent = new ArrayList<>();
        int total =0;

        int numVotes =0;
        Votes bestVote = new Votes();

        //Find who had most votes
        for(int x=0;x<5;x++)
        {
            if(votes.get(x).getVotes()>numVotes)
            {
                bestVote= votes.get(x);
                numVotes=bestVote.getVotes();
            }
        }

        //Find percent of votes
        for(int x=0;x<5;x++)
        {
            total+=votes.get(x).getVotes();
        }

        double temp =0;
        for(int x=0;x<5;x++)
        {
            temp =(votes.get(x).getVotes());
            percent.add((temp/total)*100);
        }


        //Print the Info
        for(int x=0;x<5;x++)
        {
            System.out.println(votes.get(x).getCandidate() + " >>> " + votes.get(x).getVotes() +" votes >>> %"+ percent.get(x) + " of the votes");
        }

        System.out.println("\n" +bestVote.getCandidate() + " Had the most Votes");

    }

    public static ArrayList<Votes> enterVotes()
    {
        ArrayList<Votes> v = new ArrayList<>();
        for(int x=0;x<5;x++)
        {
            System.out.println("Enter the name of Candidate " + (x+1));
            String cand = sc.nextLine();

            System.out.println("Enter the Votes recieved by Candidate "+ (x+1));
            int votes = sc.nextInt();
            sc.nextLine();

            Votes c = new Votes(cand,votes);
            v.add(c);
        }

        return v;
    }
}
