import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadBankAccountsRandomly {
    public static ArrayList<CreateBankFile.Customer> RecordsList;
    public static int getID(){
        System.out.println("Enter a valid ID from 9998 - 0");
        int id ;
        try {
            id = Integer.parseInt(CreateBankFile.key.nextLine());

            if (id>-1&&id<=9999){
                return id;
            }else {
                System.out.println("\tError: ID must be between 9998 and 0");
                return getID();
            }
        }catch (Exception e){
            System.out.println("\tError: invalid ID");
            id = getID();
            return id;
        }

    }
    public static void main(String[] args) throws Exception {
        CreateBankFile.main(new String[]{});
        // display all the non-null files
//        ReadBankAccountsSequentially.main(new String[] {});

        //open file in scanner
        Scanner readFile = new Scanner(new File("src/customerRecords.txt"));

        //initialize array
        RecordsList = new ArrayList<>();

        while (readFile.hasNextLine()){
            Scanner line = new Scanner(readFile.nextLine());
            int id= line.nextInt();
            String name = line.next();
            double bal= line.nextDouble();
            if (!name.contains("null")){
                RecordsList.add(new CreateBankFile.Customer(id,name,bal));
            }
        }
        int terminatingValue = -1;
        while (terminatingValue!=9999){
            terminatingValue = getID();
            if (terminatingValue == 9999){
                System.out.println("Program Ended");
                break;
            }else{
                CreateBankFile.Customer customer = getAccount(terminatingValue);
                System.out.printf("Customer ID: %04d has a current balance of %.2f\n",customer.ID,customer.balance);
                System.out.println("Enter an about you would like to charge them >> ");
                double charge;
                try {
                    charge = Double.parseDouble(CreateBankFile.key.nextLine());
                    customer.balance -= charge;
                } catch (Exception e){
                    System.out.println("\tError: Invalid charge amount \n\tCustomer Was not charged");
                    charge = 0;
                }
                System.out.printf("Customer ID: %04d's new balance is %.2f\n",customer.ID,customer.balance);
                RecordsList.get(customer.ID).balance = customer.balance;
            }
        }

        for (CreateBankFile.Customer c : RecordsList){
            CreateBankFile.RecordsList.set(c.ID,c);
        }

        FileWriter customerRecords = new FileWriter("src/customerRecords.txt");
        for (CreateBankFile.Customer c : CreateBankFile.RecordsList) customerRecords.append(c.toString()+"\n");
        customerRecords.close();
    }

    public static CreateBankFile.Customer getAccount(int ID){
        int id = ID;
        CreateBankFile.Customer high = null,low = null,exact = null;
        for (CreateBankFile.Customer c : RecordsList){
            if (c.ID<id) {
                low = c;
            }else if(c.ID == id){
                exact = c;
            }else if (c.ID > id){
                high = c;
                break;
            }
        }

        if (exact == null){
            if (low==null) {
                System.out.printf("Account with the id %04d doesn't exist.\nDid you mean Account ID %04d?\n\n",id,high.ID);
            }else if (high!=null){
                System.out.printf("Account with the id %04d doesn't exist.\nDid you mean Account ID %04d or %04d?\n\n",id,low.ID,high.ID);
            }else  {
                System.out.printf("Account with the id %04d doesn't exist.\nDid you mean Account ID %04d?\n\n",id,low.ID);
            }
            return getAccount(CreateBankFile.getID());
        }else{

            return exact;
        }
    }

}
