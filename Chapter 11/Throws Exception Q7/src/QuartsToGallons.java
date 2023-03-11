import java.util.*;

public class QuartsToGallons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double quarts;
        double gallons =0;

        try {

            System.out.println("Enter a how many quarts");
            quarts = sc.nextDouble();
            gallons = quarts/4;
            System.out.println("Gallons >>> "+ gallons);
        }
        catch(InputMismatchException i)
        {
            System.out.println("Invalid input >>> Please enter a numerical value");
        }


    }
}
