import java.util.*;

public class Planets {

    public enum planetLength {
        MERCURY,VENUS,EARTH,MARS,JUPITER,SATURN,URANUS,NEPTUNE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a planet name");
        String answer = sc.next().toUpperCase();

        planetLength e = planetLength.valueOf(answer);
        System.out.println(e.ordinal()+1);
    }
}
