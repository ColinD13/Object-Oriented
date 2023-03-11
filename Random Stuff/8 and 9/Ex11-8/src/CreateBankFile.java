import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class CreateBankFile {
    public static Scanner key = new Scanner(System.in);

    //objects
    public static int getID(){
        System.out.println("Enter a valid ID from 9998 - 0");
        int id ;
        try {
            id = Integer.parseInt(key.nextLine());

            if (id>-1&&id<9999){
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
    public static String getName(){
        System.out.println("Enter a last name:");
        return key.nextLine();
    }
    public static double getBalance(){
        System.out.println("Enter a Balance less than $99,000.00");
        double bal ;
        try {
            bal = Integer.parseInt(key.nextLine());

            if (bal<=99000){
                return bal;
            }else {
                System.out.println("\tError: Balance too high");
                return getBalance();
            }
        }catch (Exception e){
            System.out.println("\tError: Invalid Balance");
            bal = getBalance();
            return bal;
        }
    }

    public static  ArrayList<Customer> RecordsList;
    //main
    public static void main(String[] args) throws Exception {
        //open file in scanner
        Scanner readFile = new Scanner(new File("src/customerRecords.txt"));
        //initialize array
        RecordsList = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            RecordsList.add(new Customer(i));
        }

        //adds file data to an array
        while (readFile.hasNextLine()){
            Scanner line = new Scanner(readFile.nextLine());
            int id= line.nextInt();
            String name = line.next();
            double bal= line.nextDouble();
            RecordsList.set(id, new Customer(id, name, bal));
        }

//        int id;
//        id = getID();
//        RecordsList.set(id,new Customer(id, getName(),getBalance()));

        //sort array
        Collections.sort(RecordsList, Comparator.comparing(Customer::getID));
        // writes array to file
        FileWriter customerRecords = new FileWriter("src/customerRecords.txt");
        for (Customer c : RecordsList) customerRecords.append(c.toString()+"\n");
        customerRecords.close();
    }

    // objects
    public static class Customer {
        int ID;
        String name;
        double balance;

        public Customer(int ID, String name, double balance) {
            setID(ID);
            setName(name);
            setBalance(balance);
        }

        public Customer() {
        }
        public Customer(int id) {
            setID(id);

        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return String.format("%04d %8.8s %s",getID(),getName(),getBalance());
        }
    }
}