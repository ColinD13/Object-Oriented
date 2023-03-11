import java.util.*;

public class UsedBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the nonfiction book");
        String nTitle = sc.nextLine();

        System.out.println("Enter the title of the fiction book");
        String fTitle = sc.nextLine();

        NonFiction nf = new NonFiction(nTitle);
        Fiction f = new Fiction(fTitle);

        System.out.println(nf.toString());
        System.out.println(f.toString());
    }
}
