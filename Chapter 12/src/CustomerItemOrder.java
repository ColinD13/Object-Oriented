import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CustomerItemOrder {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            File customer = new File("C:\\Object Files\\Q9.txt");
            File items = new File("C:\\Object Files\\Q9_2.txt");
            Scanner c = new Scanner(customer);
            Scanner i = new Scanner(items);
            String line;
            String customerInfo ="";
            String itemInfo ="";
            boolean check =false;
            boolean check2 = false;

            //Customer

            System.out.println("Enter your customer number");
            String cNum = sc.nextLine();

            while(c.hasNextLine())
            {
                line = c.nextLine();
                if(line.substring(0,3).contains(cNum))
                {
                    customerInfo=line;
                    check = true;
                }
            }

            if(!check)
            {
                System.out.println("Could not find Customer Num on file");
            }

            //Item

            System.out.println("Enter your item number");
            String iNum = sc.nextLine();

            while(i.hasNextLine())
            {
                line = i.nextLine();
                if(line.substring(0,3).contains(iNum))
                {
                    itemInfo=line;
                    check2=true;
                }
            }

            if(!check2)
            {
                System.out.println("Could not find Item Num on file");
            }

            //Display Info

            if(check && check2)
            {
                System.out.println(customerInfo);
                System.out.println(itemInfo);
            }
            else{
                System.out.println("Invalid Entry");
            }

            sc.close();
            c.close();
            i.close();


        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
