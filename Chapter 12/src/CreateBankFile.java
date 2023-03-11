import java.io.File;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CreateBankFile {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Object Files\\Q8.txt");
            RandomAccessFile bank = new RandomAccessFile(f,"rw");
            Scanner sc = new Scanner(System.in);

            //Adding the blank records

            for (int x = 0; x < 1000; x++) {
                bank.writeBytes("000 ******** 0000.00\n");
            }

            //Getting Record Info

            for(int x=0;x<3;x++) {
                System.out.println("Enter the account number <Make sure it is three digits EX. 025");
                String accountNum = sc.nextLine();

                System.out.println("Enter the last name");
                String name = sc.nextLine();

                while (name.length() < 8) {
                    name += "*";
                }

                System.out.println("Enter the balance - 7 digits total EX 90000.1 or 1000.01");
                double balance = sc.nextDouble();
                sc.nextLine();

                String record = accountNum + " " + name + " " + balance + "\n";
                System.out.println(record);

                //Adding the record
                bank.seek((Integer.parseInt(accountNum) - 1) * 21);
                bank.writeBytes(record);

                bank.seek(0);
            }
            bank.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
