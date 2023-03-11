
import java.util.*;
public class DemoRocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of rock you would like to make <U,I,S,M>");
        String answer = sc.next();

        if(answer.equalsIgnoreCase("U") ||answer.equalsIgnoreCase("I") || answer.equalsIgnoreCase("S") || answer.equalsIgnoreCase("M"))
        {
            System.out.println("Enter the sample number");
            int sn = sc.nextInt();
            System.out.println("Enter the weight");
            double weight = sc.nextDouble();

            switch (answer) {
                case "U":
                    Rock u = new Rock(sn,weight);
                    System.out.println(u.toString());
                    break;
                case "I":
                    IgneousRock i = new IgneousRock(sn,weight);
                    System.out.println(i.toString());
                    break;
                case "M":
                    MetamorphicRock m = new MetamorphicRock(sn,weight);
                    System.out.println(m.toString());
                    break;
                case "S":
                    SedimentaryRock s = new SedimentaryRock(sn,weight);
                    System.out.println(s.toString());
                    break;
                default:
                    break;
            }

        }
        else
        {
            Rock blank = new Rock();
            System.out.println(blank.toString());
        }

    }
}
