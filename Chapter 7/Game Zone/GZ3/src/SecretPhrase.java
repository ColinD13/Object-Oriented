import java.util.Scanner;

public class SecretPhrase {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder answer = new StringBuilder("Hello there friend");
        StringBuilder wrong = new StringBuilder("H*l*o ther* fr*e**");
        char guess = ' ';

        do {
            System.out.println(wrong);
            System.out.println("Enter your guess");
            guess = sc.next().charAt(0);

            for (int x = 0; x < answer.length(); x++) {
                if (guess == answer.charAt(x) && wrong.charAt(x) == '*') {
                    wrong.setCharAt(x, guess);
                }
            }

            System.out.println(wrong);

        } while (!(wrong.toString().equals(answer.toString())));

        System.out.println("Congratulatoins You Win!");

        sc.close();
    }
}
