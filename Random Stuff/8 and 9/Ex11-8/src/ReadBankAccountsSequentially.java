import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadBankAccountsSequentially {
    public static void main(String[] args) throws Exception {
        //open file in scanner
        Scanner readFile = new Scanner(new File("src/customerRecords.txt"));
        //initialize array
        ArrayList<CreateBankFile.Customer> RecordsList = new ArrayList<>();

        while (readFile.hasNextLine()){
            Scanner line = new Scanner(readFile.nextLine());
            int id= line.nextInt();
            String name = line.next();
            double bal= line.nextDouble();
            if (!name.contains("null")){
                RecordsList.add(new CreateBankFile.Customer(id,name,bal));
            }
        }

        for (CreateBankFile.Customer c : RecordsList){
            System.out.println(c);
        }

    }
}
