import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SecretPhraseUsingFile {
    public static void main(String[] args) {
        try{

            File file = new File("C:\\Object Files\\GZ.txt");
            Scanner reader = new Scanner(file);
            Scanner sc = new Scanner(System.in);
            StringBuilder guess = new StringBuilder("");
            String g = "";

            int num = (int)(Math.random()*10)+1;
            String line = Files.readAllLines(Paths.get("C:\\Object Files\\GZ.txt")).get(num);
            StringBuilder answer = new StringBuilder(line);

            for(int x=0;x<line.length();x++)
            {
                guess.append("*");
            }

            do{
                System.out.println(guess);

                System.out.println("Enter your letter guess");
                g = sc.nextLine();

                for(int x=0;x<guess.length();x++)
                {
                    if(g.equals(answer.substring(x,x+1)))
                    {
                        guess=guess.replace(x,x+1,g);
                    }
                }

            }while(!guess.toString().equalsIgnoreCase(answer.toString()));

            System.out.println("You Win!!!");

        reader.close();

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
