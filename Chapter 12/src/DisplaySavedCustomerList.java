import java.io.FileReader;
import java.io.IOException;

public class DisplaySavedCustomerList {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Object Files\\Question4.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char)(i));
            }
            fr.close();
            fr.close();
        }
        catch(IOException i)
        {
            System.out.println(i.getMessage());
        }

    }
}
