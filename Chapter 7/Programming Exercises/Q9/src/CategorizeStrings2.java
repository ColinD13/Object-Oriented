import java.util.ArrayList;
import java.util.Scanner;

public class CategorizeStrings2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int space = 0;
        int type = 0;
        StringBuilder s = new StringBuilder();
        ArrayList<StringBuilder> zero = new ArrayList<StringBuilder>();
        ArrayList<StringBuilder> one = new ArrayList<StringBuilder>();
        ArrayList<StringBuilder> more = new ArrayList<StringBuilder>();

        System.out.println("When you enter the string values, if you enter \"break\" it will break out");

        do {
            System.out.println("Enter a string");
            str = sc.nextLine();
            s = new StringBuilder(str);

            for (int y = 0; y < s.length(); y++) {

                if (Character.isWhitespace(s.charAt(y)))
                    space++;
            }

            if (space == 0)
                zero.add(s);
            else if (space == 1)
                one.add(s);
            else
                more.add(s);

        } while (!(str.equals("break")));

        System.out.println();

        System.out.println("Which list would you like to see 1.No Spaces 2.One space 3.More than One Space");
        type = sc.nextInt();

        if (type == 1) {
            if (zero.size() == 0) {
                System.out.println("No items in this list");

            }
            for (int i = 0; i < zero.size(); i++) {
                System.out.println(zero.get(i));
            }
        }

        else if (type == 2) {
            if (one.size() == 0) {
                System.out.println("No items in this list");

            }
            for (int i = 0; i < one.size(); i++) {
                System.out.println(one.get(i));
            }
        }

        else if (type == 3) {
            if (more.size() == 0) {
                System.out.println("No items in this list");

            }
            for (int i = 0; i < more.size(); i++) {
                System.out.println(more.get(i));
            }
        }

        else {
            for (int i = 0; i < zero.size(); i++) {
                System.out.println(zero.get(i));
            }

            for (int i = 0; i < one.size(); i++) {
                System.out.println(one.get(i));
            }

            for (int i = 0; i < more.size(); i++) {
                System.out.println(more.get(i));
            }
        }

        sc.close();
    }
}
