import java.io.File;
import java.util.Scanner;

public class DisplaySelectedCustomer {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Object Files\\Question4.txt");
            Scanner sc = new Scanner(System.in);
            Scanner reader = new Scanner(f);
            String line;
            boolean check = false;

            System.out.println("Enter the ID num to look for");
            String num = sc.nextLine();


            while(reader.hasNextLine())
            {
                line = reader.nextLine();
                if(line.contains(num)) {
                    System.out.println(line);
                    check =true;
                }
            }

            if(check == false)
            {
                System.out.println("No records of that ID Number");
            }

            sc.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
