import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class StudentStanding {
    public static void main(String[] args) {

        try{
            File good = new File("C:\\Object Files\\Q7_Good.txt");
            File bad = new File("C:\\Object Files\\Q7_Bad.txt");
            FileWriter fGood = new FileWriter(good);
            FileWriter fBad = new FileWriter(bad);

            for(int x=0;x<4;x++) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the ID num");
                int num = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter the First Name");
                String fName = sc.nextLine();

                System.out.println("Enter the Last Name");
                String lName = sc.nextLine();

                System.out.println("Enter the GPA");
                double gpa = sc.nextDouble();

                String student = "ID Num >>> " + num + " Name >>> "+ fName + " " + lName + " GPA >>> " + gpa;

                if(gpa>=2.0)
                {
                    student+=(" Distance From 2.0 >>> " + (gpa-2.0) + "\n");
                    fGood.write(student);
                }
                else
                {
                    student+=(" Distance From 2.0 >>> " + (2.0-gpa) + " \n");
                    fBad.write(student);
                }
            }

            fGood.close();
            fBad.close();

        }
        catch(Exception e )
        {
            System.out.println(e.getMessage());
        }

    }
}
