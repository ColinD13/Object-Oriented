import java.util.*;

public class TryToParseDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        try {
            System.out.println("Enter a String number to parse into a double");
            answer = sc.nextLine();
            System.out.println("It worked >>> " + Double.parseDouble(answer));
        }
        catch(NumberFormatException n){
            answer = "0";
            System.out.println(Double.parseDouble(answer));
            System.out.println("Number Format Exception: Number set to 0 " + n.getMessage());
        }



        sc.close();
    }
}
