import java.util.*;

public class ThrowUsedCarException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UsedCar[] cars = new UsedCar[7];
        String vin;
        String make;
        int year;
        int mileage;
        int price;
        int x;
        for(x=0;x < cars.length;x++)
        {
            cars[x] = new UsedCar();
        }

        for(x=0; x<cars.length;x++)
        {
            try
            {
                System.out.println("Enter 4 = digit VIN >> ");
                vin = sc.nextLine();
                System.out.println("Enter make >> ");
                make = sc.nextLine();
                System.out.println("Enter year >> ");
                year = sc.nextInt();
                System.out.println("Enter mileage >> ");
                mileage = sc.nextInt();
                System.out.println("Enter price >> ");
                price = sc.nextInt();
                sc.nextLine();
                cars[x] = new UsedCar(vin,make, year, mileage, price);
            }
            catch(UsedCarException error)
            {
                System.out.println("Object creation error: " + error.getMessage());
            }
            catch(Exception error)
            {
                System.out.println("Data entry error ");
            }

            System.out.println("Good used car values");
            for(x=0;x<cars.length;x++)
            {
                if(!cars[x].getVin().equals(UsedCar.DEFAULT_VIN))
                    System.out.println(cars[x].toString());
            }

    }

}
}
