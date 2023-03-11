import java.util.*;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]numbers = new int[5];
        int entry = 0;

        for(int x =0; x<numbers.length;x++)
        {
            System.out.println("Enter an integer value");
            entry = sc.nextInt();
            numbers[x]= entry;
        }

        displayInt(numbers);
        System.out.println();
        displayIntReverse(numbers);
        System.out.println();
        displaySum(numbers);
        System.out.println();
        displayLessTwelve(numbers);
        System.out.println();
        displayAboveAverage(numbers);
    }

    public static void displayInt(int[]numbers)
    {
        for(int x =0;x<numbers.length;x++)
        {
            System.out.println("Number:"+ (x+1)+ " "+ numbers[x]);
        }
    }

    public static void displayIntReverse(int[]numbers)
    {
        for(int x =numbers.length-1;x>=0;x--)
        {
            System.out.println("Number:"+ (x+1)+ " "+ numbers[x]);
        }
    }

    public static void displaySum(int[]numbers)
    {
        int sum =0;
        for(int x =numbers.length-1;x>=0;x--)
        {
            sum+=numbers[x];
        }

        System.out.println("Sum: "+ sum);
    }

    public static void displayLessTwelve(int[]numbers)
    {
    boolean check = true;
        for(int x =numbers.length-1;x>=0;x--)
        {
            if(numbers[x]<12) {
                System.out.println("Number: " + numbers[x]);
                check = false;
            }
        }
        if(check==true)
            System.out.println("No numbers under 12");
    }

    public static void displayAboveAverage(int[]numbers)
    {
        int average = 0;
        int total =0;

        for(int x =0; x<numbers.length; x++)
        {
            total+=numbers[x];
        }

        average=total/numbers.length;

        for(int y=0; y<numbers.length;y++)
        {
            if(numbers[y]>average)
                System.out.println(numbers[y] +" is greater than "+ average);
        }
    }

}
