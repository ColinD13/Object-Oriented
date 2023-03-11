import java.io.File;
import java.util.*;

public class ReadBankSequentially {
    public static void main(String[] args) {

        try{
            File f = new File("C:\\Object Files\\Q8.txt");
            Scanner reader = new Scanner(f);
            ArrayList<String> nums = new ArrayList<String>();
            String line;
            int test1;
            int test2;
            int test3;

            while(reader.hasNextLine())
            {
                line= reader.nextLine();
                test1= Integer.parseInt(line.substring(0,1));
                test2= Integer.parseInt(line.substring(1,2));
                test3= Integer.parseInt(line.substring(2,3));

                if(test1>0 || test2>0 || test3>0)
                {
                    nums.add(line);
                }
            }

            Collections.sort(nums);
            System.out.println(nums);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
