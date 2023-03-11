import java.util.Scanner;
public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double entry=0.0;
        double[]numbers = new double[15];
        double total =0.0;
        double average =0.0;
        boolean checking =true;

        for(int x =0; x<15;x++)
        {
            System.out.println("Enter a number, Enter 99999 if you would like to quit entering numbers");
            entry = sc.nextDouble();

            if(entry==99999 && numbers[0]==0)
            {
                checking=false;
                break;
            }
            else if(entry==99999)
            {
                break;
            }

            numbers[x]=entry;
            total+=entry;
            average = total/(x);
        }

        if(checking==false)
        {
            System.out.println("Error: No numbers entered");
        }
        else {

            System.out.println(total);
            System.out.println(average);

            for (int y = 0; y < numbers.length; y++) {
                if (numbers[y] > 0) {
                    System.out.println("Number: " + (y + 1) + " is " + numbers[y]);
                    System.out.println("Distance from average: " + (average - numbers[y]));
                }
            }
        }

        sc.close();
    }
}
