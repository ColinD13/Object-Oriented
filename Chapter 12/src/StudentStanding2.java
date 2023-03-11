import java.io.File;
import java.util.Scanner;

public class StudentStanding2 {
    public static void main(String[] args) {

        try {
            File good = new File("C:\\Object Files\\Q7_Good.txt");
            File bad = new File("C:\\Object Files\\Q7_Bad.txt");
            Scanner sG = new Scanner(good);
            Scanner sB = new Scanner(bad);
            String line;
            double num;

            System.out.println("Students above or equal to 2.0 GPA");
            while(sG.hasNextLine()) {
                line = sG.nextLine();
                System.out.println(line);
            }

            System.out.println("\nStudents below 2.0 GPA");
            while(sB.hasNextLine()) {
                line = sB.nextLine();
                System.out.println(line);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
