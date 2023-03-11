import java.util.*;

public class BabyNameComparison {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name");
        String n1 = sc.next();

        System.out.println("Enter the second name");
        String n2 = sc.next();

        System.out.println("Enter the third name");
        String n3 = sc.next();

        String combine1 = n1 + " " + n2;
        String combine2 = n1 + " " + n3;
        String combine3 = n2 + " " + n1;
        String combine4 = n2 + " " + n3;
        String combine5 = n3 + " " + n1;
        String combine6 = n3 + " " + n2;

        System.out.println();

        System.out.println(combine1);
        System.out.println(combine2);
        System.out.println(combine3);
        System.out.println(combine4);
        System.out.println(combine5);
        System.out.println(combine6);

        sc.close();

    }
}
