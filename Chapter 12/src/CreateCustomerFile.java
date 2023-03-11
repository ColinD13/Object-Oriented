import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CreateCustomerFile {
    public static void main(String[] args) {

        try {
            File f = new File("C:\\Object Files\\Q9.txt");
            RandomAccessFile file = new RandomAccessFile(f,"rw");
            Scanner sc = new Scanner(System.in);
            boolean check = true;

            for(int x=0;x<20;x++)
            {
                file.writeBytes("*** ****** *****\n");
            }


            for(int y=0;y<3;y++) {
                //Id num
                System.out.println("Enter the 3 digit ID Number");
                String id = sc.nextLine();

                //Name
                System.out.println("Enter the last name");
                String name = sc.nextLine();

                if(name.length() > 6) {
                    System.out.println("Error >>> Last Name greater than 6 letters");
                    name = name.substring(0, 6);
                } else {
                    for (int x = name.length(); x < 6; x++) {
                        name += "*";
                    }
                }

                //Zip

                System.out.println("Enter the 5 digit zip code");
                String zip = sc.nextLine();

                String record = id + " " + name + " " + zip + "\n";
                System.out.println(record);

                while(file.getFilePointer() < file.length())
                {
                    if(file.readLine().substring(0,3).contains(id))
                    {
                        check = false;
                        System.out.println("testing");
                    }

                }

                if(check) {
                    file.seek((Integer.parseInt(id) - 1) * 17);
                    file.writeBytes(record);
                }
                else {
                    System.out.println("Cannot enter the customer the Id num already is in the list");
                }

                check=true;
                file.seek(0);

            }
            file.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
