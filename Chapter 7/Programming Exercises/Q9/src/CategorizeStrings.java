import java.util.ArrayList;
import java.util.Scanner;

public class CategorizeStrings {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int length = 0;
        int type = 0;
        StringBuilder s = new StringBuilder();
        ArrayList<StringBuilder> less = new ArrayList<StringBuilder>();
        ArrayList<StringBuilder> more = new ArrayList<StringBuilder>();

        System.out.println("When you enter the string values, if you enter \"break\" it will break out");

        do {
            System.out.println("Enter a string");
            str = sc.nextLine();
            s = new StringBuilder(str);
            length = s.length();

            if (length < 11)
                less.add(s);
            else if (length >= 11)
                more.add(s);
            else
                System.out.println("Leaving loop");

        } while (!(str.equals("break")));

        System.out.println();

        do {

            System.out.println("Would you like to see the long or short list 1.Long 2.Short");
            type = sc.nextInt();

            if (type == 1) {
                if (more.size() == 0) {
                    System.out.println("No items in this list");
                    break;
                }
                for (int i = 0; i < more.size(); i++) {
                    System.out.println(more.get(i));
                }
            }

            if (type == 2) {
                if (less.size() == 0) {
                    System.out.println("No items in this list");
                    break;
                }
                for (int i = 0; i < less.size(); i++) {
                    System.out.println(less.get(i));
                }
            }
        } while (type != 1 && type != 2);

        sc.close();
    }
}
