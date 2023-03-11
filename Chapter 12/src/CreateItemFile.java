import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CreateItemFile {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Object Files\\Q9_2.txt");
            RandomAccessFile file = new RandomAccessFile(f,"rw");
            Scanner sc = new Scanner(System.in);
            boolean check = true;

            for(int x=0;x<20;x++)
            {
                file.writeBytes("*** ********************\n");
            }


            for(int y=0;y<3;y++) {
                //Id num
                System.out.println("Enter the 3 digit ID Number");
                String id = sc.nextLine();

                //Dec
                System.out.println("Enter the decription");
                String dec = sc.nextLine();

                if(dec.length() > 20) {
                    System.out.println("Error >>> Last Name greater than 6 letters");
                    dec = dec.substring(0, 20);
                } else {
                    for (int x = dec.length(); x < 20; x++) {
                        dec += "*";
                    }
                }

                String record = id + " " + dec + "\n";
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
                    file.seek((Integer.parseInt(id) - 1) * 25);
                    file.writeBytes(record);
                }
                else {
                    System.out.println("Cannot enter the item the Id num already is in the list");
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
