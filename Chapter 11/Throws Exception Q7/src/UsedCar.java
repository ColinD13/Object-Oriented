import java.util.Arrays;

public class UsedCar {
    String vin;
    String make;
    int year;
    int mileage;
    int price;

    public final static String DEFAULT_VIN = "9999";

    final int VIN_NUM_LENGTH = 4;
    final int LOW_YEAR = 1997;

    final int HIGH_YEAR = 2024;

    final String[] MAKES = {"ford", "honda", "Toyota", "Chrysler","Other"};

    public UsedCar(String num, String carMake,int carYear, int miles, int pr) throws UsedCarException
    {
        boolean isBad = false;
        boolean isGoodMake = false;
        int x;
        if(num.length() != VIN_NUM_LENGTH)
            isBad = true;
        for(x = 0;x< num.length();x++)
        {
            if(!Character.isDigit(num.charAt(x)))
            {
                isBad = true;
            }
        }

        for(x =0;x<MAKES.length;x++)
        {
            if(carMake.equals(MAKES[x]))
                isGoodMake = true;
        }

        if(isGoodMake)
            isBad = true;
        if(carYear < LOW_YEAR || carYear> HIGH_YEAR || miles < 0 || pr < 0)
            isBad = true;
        if(isBad)
            throw(new UsedCarException("Error is used car # " + num));

        vin = num;
        make = carMake;
        year = carYear;
        mileage = miles;
        price = pr;
    }

    public UsedCar()
    {
        vin = DEFAULT_VIN;
        make = "XXX";
    }

    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return "UsedCar{" +
                "vin='" + vin + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", price=" + price +
                ", VIN_NUM_LENGTH=" + VIN_NUM_LENGTH +
                ", LOW_YEAR=" + LOW_YEAR +
                ", HIGH_YEAR=" + HIGH_YEAR +
                ", MAKES=" + Arrays.toString(MAKES) +
                '}';
    }


}
