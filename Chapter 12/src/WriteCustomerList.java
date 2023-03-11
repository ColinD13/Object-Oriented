import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

public class WriteCustomerList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            File f = new File("C:\\Object Files\\Question4.txt");
            FileWriter fw = new FileWriter(f);

            for(int x=0;x<3;x++) {
                System.out.println("Enter the ID num");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter First Name");
                String fName = sc.nextLine();

                System.out.println("Enter the last name");
                String lName = sc.nextLine();

                System.out.println("Enter the balance due");
                double balance = sc.nextDouble();

                String record = "ID: " + id + " " + fName + " " + lName + " Balance Due: " + balance;

                fw.write(record + "\n");
            }
            fw.flush();
            fw.close();

        }
        catch(IOException i)
        {
            System.out.println("IO Exception caught");
        }

        sc.close();
    }
}
