import java.util.*;

public class DemoBlankets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Blanket b = new Blanket();
        System.out.println(b.toString());

        System.out.println("Enter the material you would like");
        String material = sc.nextLine();
        b.setMaterial(material);
        System.out.println(b.toString());

        System.out.println("Enter the size");
        String size = sc.nextLine();
        b.setSize(size);
        System.out.println( b.toString());

        System.out.println("Enter the color");
        String color = sc.nextLine();
        b.setColor(color);
        System.out.println( b.toString());


        //Electric Blanket

        ElectricBlanket e = new ElectricBlanket();
        System.out.println(e.toString());

        System.out.println("Enter the material you would like");
        String material2 = sc.nextLine();
        e.setMaterial(material2);
        System.out.println(e.toString());

        System.out.println("Enter the size");
        String size2 = sc.nextLine();
        e.setSize(size);
        System.out.println(e.toString());

        System.out.println("Enter the color");
        String color2 = sc.nextLine();
        e.setColor(color);
        System.out.println(e.toString());

        System.out.println("Enter the number of settings");
        int settings = sc.nextInt();
        e.setNumSettings(settings);
        System.out.println(e.toString());

        System.out.println("Enter if it can shutoff or not <true-false>");
        Boolean shutoff = sc.nextBoolean();
        e.setShutoff(shutoff);
        System.out.println(e.toString());


    }
}
