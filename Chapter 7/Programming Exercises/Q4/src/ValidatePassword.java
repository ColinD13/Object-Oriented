import java.util.*;

public class ValidatePassword {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int uC = 0;
        int lC = 0;
        int digit = 0;
        int rerun = 0;

        // reruns the program
        do {

            rerun = 0;
            uC = 0;
            lC = 0;
            digit = 0;

            System.out.println("Enter the password");
            String password = sc.next();

            // testing for upper, lower, and digit
            for (int x = 0; x < password.length(); x++) {
                if (Character.isUpperCase(password.charAt(x))) {
                    uC++;
                } else if (Character.isLowerCase(password.charAt(x))) {
                    lC++;
                } else if (Character.isDigit(password.charAt(x))) {
                    digit++;
                } else {
                    System.out.println("Error");
                }
            } // end of testing

            if (uC >= 2 && lC >= 3 && digit >= 1) {
                System.out.println("Password Is Valid");
            } else {

                if (uC < 2) {
                    System.out.println("You need two or more upper case letters");
                }

                if (lC < 3) {
                    System.out.println("You need three or more lowercase letters");
                }

                if (digit < 1) {
                    System.out.println("You need one or more digits");
                }

                rerun = 1;
            }

        } while (rerun == 1);

        sc.close();
    }
}
