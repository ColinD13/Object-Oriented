import java.util.*;

public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fifteen = new String[15];
        String input;

        for(int x=0; x<fifteen.length;x++)
        {
            System.out.println("Enter a string, enter \"break\" if you would like to stop entering values");
            input = sc.nextLine();

            if(input.equals("break"))
                break;

            fifteen[x]=input;
        }

        for(int x=0;x<fifteen.length;x++)
        {
            if(fifteen[x+1].compareTo(fifteen[x])>0) {
                String temp = fifteen[x];
                fifteen[x] = fifteen[x+1];
                fifteen[x+1] = temp;
            }
        }

        System.out.println(Arrays.toString(fifteen));

        sc.close();

    }
}
