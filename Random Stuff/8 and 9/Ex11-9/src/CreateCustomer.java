import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CreateCustomer  {
    public static Scanner key = new Scanner(System.in);
    public static final String FILE = "src/customerFile.txt";
    public static final String ITEM_FILE = "src/ItemFile.txt";
    public static Scanner readFile;
    public static ArrayList<Customer> customers = new ArrayList<>();

    // a
    public static class CreateCustomerFile{
        public static void main() throws Exception {

        }
        public static void newFile() throws Exception {
            AddData.populateCustomerArray();
            AddData.addNewCustomer();
            System.out.println(customers);
            AddData.addNewCustomer();
            WriteFile.saveCustomerToFile(FILE,customers);
            System.out.println(customers);
        }
    }
    // b
    public static class CreateItemFile{
        public static ArrayList<Item> items = new ArrayList<>();
        public static void main() throws Exception {

        }
        public static void newItem() throws Exception {
            AddData.populateItemArray();
            System.out.println(items);
            AddData.addNewItem();
            WriteFile.saveItemToFile(ITEM_FILE,items);
            System.out.println(items);
        }
    }
    //c
    public static class Order{
        public static void main() throws Exception {
            AddData.populateCustomerArray();
            System.out.println(customers);
            ArrayList<Item> cart = new ArrayList<>();
            System.out.println("What is your ID Number?");
            int id = getValidID();
            String end = "y";
            while (!end.equalsIgnoreCase("n")){
                System.out.println("Enter Item ID to add it to your cart");
                int itemId = getValidItem();
                for (Item c : CreateItemFile.items)if(c.getID()==itemId)cart.add(c);
                System.out.println("would you like to add another item? (y/n)");
                end = key.nextLine();

            }
            System.out.println("your cart:");
            System.out.println(cart);

        }

    }

    public static class AssignmentPart{
        public static void main(String args) throws Exception {
            if (args.equalsIgnoreCase("a")){
                System.out.println("9.a");
                CreateCustomerFile.newFile();
            }else if (args.equalsIgnoreCase("b")){
                System.out.println("9.b");
                CreateItemFile.newItem();
            } else if (args.equalsIgnoreCase("c")) {
                System.out.println("9.c");
                Order.main();
            }
        }
    }
    public static class ReadFile {
        public static void main(String file) throws Exception {
            readFile = new Scanner(new File(file));
        }
        public static String nextLine(){
            return readFile.nextLine();
        }

    }
    public static class AddData{


        public static void populateCustomerArray() throws Exception {

            ReadFile.main(FILE);

            while (readFile.hasNextLine()){
                Scanner line = new Scanner(readFile.nextLine());
                customers.add(new Customer(line.nextInt(),line.next(),line.nextInt() ));
            }
        }
        public static void populateItemArray() throws Exception {

            ReadFile.main(ITEM_FILE);

            while (readFile.hasNextLine()){
                Scanner line = new Scanner(readFile.nextLine());
                CreateItemFile.items.add(new Item(line.nextInt(),line.next()));
            }
        }

        public static void addNewItem(){
            CreateItemFile.items.add(new Item(setItemID(),setName(20)));
        }
        public static void addNewCustomer(){
            int id = setID();
            boolean exists = false;
            Customer c = new Customer(id,setName(6),setZipCode());
            for (Customer x : customers){
                if (x.ID==id) {
                    exists = true;
                }
            }
            if (exists){
                for (int i = 0; i < customers.size(); i++) {
                    if (customers.get(i).getID() == c.getID()){
                        customers.set(i,c);
                    }
                }
            }else {
                customers.add(c);
                Collections.sort(customers,Comparator.comparing(Customer::getID));
            }
        }

    }
    public static class WriteFile {
        public static void main(String[] args) {
        }

        public static void createNewFile(String FILE) throws Exception{
            FileWriter file = new FileWriter(FILE);
            file.close();
        }
        public static void saveCustomerToFile(String file, ArrayList<Customer> s) throws IOException {
            FileWriter fileWriter = new FileWriter(file);

        //add each customer to the file
            for (Customer c : s) fileWriter.append(c.toString()).append("\n");

        //close file
            fileWriter.close();

        }
        public static void saveItemToFile(String file, ArrayList<Item> s) throws IOException {
            FileWriter fileWriter = new FileWriter(file);

            //add each customer to the file
            for (Item i : s) fileWriter.append(i.toString()).append("\n");

            //close file
            fileWriter.close();

        }

    }
    public static void main(String[] args) throws Exception {
        System.out.println("What Part of the assignment would you like to complete? >>");
        AssignmentPart.main(key.nextLine());
    }
    public static int setID(){
        System.out.println("Enter ID >>");
        int newID;
        boolean idExists=false;

        // sets new id to a valid number
        try {
            newID = Integer.parseInt(key.nextLine());
        } catch (Exception e){
            System.out.println("Invalid ID");
            return setID();
        }

        for (Customer c : customers)
            if (c.getID() == newID) {
                idExists = true;
                break;
            }

        // Error messages
        if (idExists){
            System.out.println("That ID already exists");
            return setID();
        }else if (newID>999||newID<0) {
            System.out.println("Please enter a 3 digit value");
            return setID();
        }else{
            return newID;
        }
    }
    public static int setItemID(){
        System.out.println("Enter ID >>");
        int newID;
        boolean idExists=false;

        // sets new id to a valid number
        try {
            newID = Integer.parseInt(key.nextLine());
        } catch (Exception e){
            System.out.println("Invalid ID");
            return setItemID();
        }

        for (Item i : CreateItemFile.items)
            if (i.getID() == newID) {
                idExists = true;
                break;
            }

        // Error messages
        if (idExists){
            System.out.println("That ID already exists");
            return setItemID();
        }else if (newID>999||newID<0) {
            System.out.println("Please enter a 3 digit value");
            return setItemID();
        }else{
            return newID;
        }
    }
    public static int setZipCode(){
        System.out.println("Enter the Zip Code >> ");
        try {
            return Integer.parseInt(key.nextLine());
        } catch (Exception e){
            return setZipCode();
        }
    }

    public static int getValidID() throws Exception {
        System.out.println("Enter ID >>");
        int newID;
        boolean idExists=false;
        try {
            newID = Integer.parseInt(key.nextLine());
        } catch (Exception e){
            System.out.println("Invalid ID");
            return getValidID();
        }
        for (Customer c : customers)
            if (c.getID() == newID) {
                idExists = true;
                break;
            }
        if (!idExists){
            System.out.println("That ID Does not exist");
            return getValidID();
        }else if (newID>999||newID<0) {
            System.out.println("Please enter a 3 digit value");
            return getValidID();
        }else{
            return newID;
        }
    }
    public static int getValidItem() throws Exception {
        int ItemId;
        boolean idExists=false;
        if (CreateItemFile.items.size() == 0){
            AddData.populateItemArray();
        }
        try {
            ItemId = Integer.parseInt(key.nextLine());
        } catch (Exception e){
            System.out.println("Invalid Item ID");
            return getValidItem();
        }
        for (Item c : CreateItemFile.items)
            if (c.getID() == ItemId) {
                idExists = true;
                break;
            }
        if (!idExists){
            System.out.println("That Item Does not exist");
            return getValidItem();
        }else if (ItemId>999||ItemId<0) {
            System.out.println("Please enter a 3 digit value");
            return getValidItem();
        }else{
            return ItemId;
        }
    }
    public static String setName(int len){
        System.out.println("Enter a name >> ");
        String name = key.nextLine();
        String Format = "%"+len+"."+len+"s";
        return String.format(Format,name.replace(" ",""));
    }

}