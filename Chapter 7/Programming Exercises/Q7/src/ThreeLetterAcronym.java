import java.util.Scanner;

public class ThreeLetterAcronym {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int index1 = 0;
        int index2 = 0;
        String acronym = "";

        System.out.println("Enter three words with spaces between");
        String word = sc.nextLine();

        if (Character.isLetter(word.charAt(0))) {
            acronym += word.substring(0, 1);
        } else {
            System.out.println("Error");
        }

        index1 = word.indexOf(" ");
        acronym += word.substring(index1 + 1, index1 + 2);

        index2 = word.indexOf(" ", index1 + 1);
        acronym += word.substring(index2 + 1, index2 + 2);

        System.out.println(acronym.toUpperCase());

        sc.close();

    }
}
