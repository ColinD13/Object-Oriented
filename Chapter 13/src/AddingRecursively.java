import java.util.Scanner;

public class AddingRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int two =0;


        System.out.println("Enter the first integer");
        int one = sc.nextInt();

        do{

            System.out.println("Enter the second integer");
            two = sc.nextInt();

        }while(one>two);

        System.out.println(sum(one,two));
    }

    public static int sum(int one, int two)
    {
        if(two>one)
        {
            return two + sum(one,two-1);
        }
        else
            return two;
    }

}