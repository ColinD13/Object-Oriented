import java.util.*;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String entry ="";
        boolean isMatch= false;
        String[]items = {"oil change","tire rotation","battery check","brake check"};
        int[]prices ={25,22,15,5};
        int x;
        int matchIndex=0;

        for(x =0; x<items.length;x++)
        {
            System.out.println(items[x]);
        }

        System.out.println("Enter selection >>");
        entry = sc.nextLine();

        for(x=0;x<items.length;x++)
        {
            if(entry.equals(items[x])) {
                isMatch = true;
                matchIndex = x;
            }
        }

        if(isMatch)
        {
            System.out.println(entry + "price is $" + prices[matchIndex]);
        }
        else
        {
            System.out.println("Invalid Entry");
        }
    }
}