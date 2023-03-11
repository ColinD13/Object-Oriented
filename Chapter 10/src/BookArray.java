import java.util.*;

public class BookArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[10];
        String title;
        String answer;

        for(int x=0;x<10;x++)
        {
            System.out.println("Enter the title of the book");
            title = sc.nextLine();

            System.out.println("Is that a nonfiction or fiction book <N-F>");
            answer = sc.nextLine();

            if(answer.equalsIgnoreCase("n"))
            {
                NonFiction nf = new NonFiction(title);
                books[x]= nf;
            }
            else if(answer.equalsIgnoreCase("f"))
            {
                Fiction f = new Fiction(title);
                books[x]=f;
            }
            else
            {
                System.out.println("Error");
            }
        }

        System.out.println(Arrays.toString(books));

        sc.close();
    }
}
