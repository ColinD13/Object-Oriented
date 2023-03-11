import java.util.*;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arrayLength ="0";
        int lengthInt =0;
        double[] nums = new double[0];
        double avg=0;
        double difference =0;

        try{
            System.out.println("Enter an integer value for the length of an array");
            arrayLength = sc.nextLine();
            lengthInt = Integer.parseInt(arrayLength);

            nums = new double[lengthInt];
        }
        catch(NumberFormatException n)
        {
            System.out.println("Number Format Exception >>> Please enter an integer value only");
        }
        catch(NegativeArraySizeException n)
        {
            nums = new double[5];
        }


        try{
            for(int x=0;x<nums.length;x++)
            {
                System.out.println("Enter value: "+ (x+1));
                nums[x]= sc.nextDouble();
                avg+=nums[x];
            }

            avg/=nums.length;

            for(int x = 0;x<nums.length;x++)
            {
                if(nums[x]>avg)
                    difference=nums[x]-avg;
                else
                    difference=avg-nums[x];
                System.out.println("Distance from Average for value " + (x+1) + " :" + difference);
            }



        }
        catch(InputMismatchException inputMismatchException)
        {
            System.out.println("Input Mistmatch Excption >>> Enter doubles only for the array ");
        }

        sc.close();

    }
}
