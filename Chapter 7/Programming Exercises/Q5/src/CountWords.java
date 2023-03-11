import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter a sentence");
        String s = sc.nextLine();

        for (int x = 0; x < s.length() - 1; x++) {
            if (Character.isLetter(s.charAt(x)) && s.charAt(x + 1) == ' ' && (x == 0)) {
                num++;
            } else if (Character.isLetter(s.charAt(x)) && s.charAt(x + 1) == '.' && (x == 0)) {
                num++;
            } else if (Character.isLetter(s.charAt(x)) && s.charAt(x + 1) == ',' && (x == 0)) {
                num++;
            } else if (Character.isLetter(s.charAt(x)) && s.charAt(x + 1) == ';' && (x == 0)) {
                num++;
            } else if (Character.isLetter(s.charAt(x)) && s.charAt(x + 1) == '?' && (x == 0)) {
                num++;
            } else if (Character.isLetter(s.charAt(x)) && s.charAt(x + 1) == '!' && (x == 0)) {
                num++;
            } else if (Character.isLetter(s.charAt(x)) && s.charAt(x + 1) == '-' && (x == 0)) {
                num++;
            } else if (s.charAt(x) == ' ' && Character.isLetter(s.charAt(x + 1))) {
                num++;
            } else if (s.charAt(x) == '.' && Character.isLetter(s.charAt(x + 1))) {
                num++;
            } else if (s.charAt(x) == ',' && Character.isLetter(s.charAt(x + 1))) {
                num++;
            } else if (s.charAt(x) == ';' && Character.isLetter(s.charAt(x + 1))) {
                num++;
            } else if (s.charAt(x) == '?' && Character.isLetter(s.charAt(x + 1))) {
                num++;
            } else if (s.charAt(x) == '!' && Character.isLetter(s.charAt(x + 1))) {
                num++;
            } else if (s.charAt(x) == '-' && Character.isLetter(s.charAt(x + 1))) {
                num++;
            }
        }

        System.out.println("Number of words:" + (num + 1));

        sc.close();

    }
}
