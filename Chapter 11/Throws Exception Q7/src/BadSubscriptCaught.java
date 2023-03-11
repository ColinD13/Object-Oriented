import java.util.*;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Colin","Zac","Joe","Christian","Nicolei","Dylan","Enzo","Jacob"};
        int answer;

        try{
            System.out.println("Enter an integer 0-7");
            answer = sc.nextInt();
            System.out.println(names[answer]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }
    }
}
