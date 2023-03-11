import java.io.File;
import java.util.Scanner;

public class DisplaySelectedCustomerByName {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Object Files\\Question4.txt");
            Scanner sc = new Scanner(System.in);
            Scanner reader = new Scanner(f);
            String line;
            boolean check = false;

            System.out.println("Enter the Last Name to look for");
            String lName = sc.nextLine();


            while(reader.hasNextLine())
            {
                line = reader.nextLine();
                if(line.contains(lName)) {
                    System.out.println(line);
                    check =true;
                }
            }

            if(check == false)
            {
                System.out.println("No records of that Last Name");
            }

            sc.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
