import java.util.*;

public class SqrtException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer="";
        int num =0;

        try {
            System.out.println("Enter an integer to find the square root of");
            answer = sc.nextLine();
            num = Integer.parseInt(answer);

            if(num<0)
                throw(new ArithmeticException());

            System.out.println("Square Root >>> " + Math.sqrt(num));
        }
        catch(NumberFormatException n)
        {
            System.out.println("Number format exception >>> enter an integer value");
            num =0;
        }
        catch(ArithmeticException a)
        {
            System.out.println("Arithmetic Exception >>> Cannot take the square root of a negative number");
        }

    }
}
