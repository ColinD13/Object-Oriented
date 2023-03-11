import java.util.*;

public class DemoCandles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the color for the candle");
        String color = sc.next();

        System.out.println("Enter the height of the candle");
        double height = sc.nextDouble();

        Candle c = new Candle(color,height);

        System.out.println("Enter the color of the scented candle");
        String colorTwo = sc.next();

        System.out.println("Enter the height of the scented candle");
        double heightTwo = sc.nextDouble();

        System.out.println("Enter the scent of the candle <Pumpkin, Winter Breeze, Maple, Candy Apple>");
        String scent = sc.next();

        ScentedCandle s = new ScentedCandle(colorTwo,heightTwo,scent);

        System.out.println(c.toString());
        System.out.println(s.toString());
    }
}
