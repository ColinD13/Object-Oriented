import java.util.*;
public class Strings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> wrong = new ArrayList<>();
        String q1,q2,q3,q4,q5;
        int correct=0;

        q1 = "What is 1+1?";
        q2 = "What is 2+2?";
        q3 = "What is 3+3?";
        q4 = "What is 4+4?";
        q5 = "What is 5+5?";

        correct+=question1(q1,wrong);
        correct+=question2(q2,wrong);
        correct+=question3(q3,wrong);
        correct+=question4(q4,wrong);
        correct+=question5(q5,wrong);

        System.out.println(correct + "/5 correct");

        System.out.println(wrong);

    }

    public static int question1(String q1,ArrayList<String> wrong)
    {
        System.out.println(q1 + "a>1 b>2 c>3 d>4");
        String ans = sc.nextLine();

        if(ans.equalsIgnoreCase("b"))
            return 1;
        else
            wrong.add("Question 1 is wrong");
            return 0;
    }

    public static int question2(String q2,ArrayList<String> wrong)
    {
        System.out.println(q2 + "a>4 b>8 c>12 d>16");
        String ans = sc.nextLine();

        if(ans.equalsIgnoreCase("a"))
            return 1;
        else
            wrong.add("Question 2 is wrong");

            return 0;
    }

    public static int question3(String q3,ArrayList<String> wrong)
    {
        System.out.println(q3 + "a>3 b>6 c>9 d>12");
        String ans = sc.nextLine();

        if(ans.equalsIgnoreCase("b"))
            return 1;
        else
            wrong.add("Question 3 is wrong");
            return 0;
    }

    public static int question4(String q4,ArrayList<String> wrong)
    {
        System.out.println(q4 + "a>1 b>2 c>4 d>8");
        String ans = sc.nextLine();

        if(ans.equalsIgnoreCase("d"))
            return 1;
        else
            wrong.add("Question 4 is wrong");
            return 0;
    }

    public static int question5(String q5,ArrayList<String> wrong)
    {
        System.out.println(q5 + "a>5 b>10 c>15 d>20");
        String ans = sc.nextLine();

        if(ans.equalsIgnoreCase("b"))
            return 1;
        else
            wrong.add("Question 5 is wrong");
            return 0;
    }
}
