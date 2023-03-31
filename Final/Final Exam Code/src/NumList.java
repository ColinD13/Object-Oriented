import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumList {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        //Adding nums
        for(int x=0;x<100;x++)
        {
            nums.add((int)(Math.random()*100)+1);
        }

        System.out.println("Average >>> "+ findAvg(nums));
        System.out.println("Minimum >>> " + findMin(nums));
        System.out.println("Maximum >>> " + findMax(nums));
        System.out.println("Standard Deviation >>> " + findDeviation(nums));
        System.out.println("Mode >>> " + findMode(nums));
    }

    public static int findAvg(ArrayList<Integer> nums)
    {
        int total =0;

        for(int x=0;x<100;x++)
        {
            total+=nums.get(x);
        }

        return total/100;
    }

    public static int findMin(ArrayList<Integer> nums)
    {
        int min = 1000000;

        for(int x=0;x<100;x++)
        {
            if(nums.get(x)<min)
                min = nums.get(x);
        }

        return min;
    }

    public static int findMax(ArrayList<Integer> nums)
    {
        int max = -1000000;

        for(int x=0;x<100;x++)
        {
            if(nums.get(x)>max)
                max = nums.get(x);
        }

        return max;
    }

    public static double findDeviation(ArrayList<Integer> nums)
    {
        int avg = findAvg(nums);

        double dev = (double)(Math.sqrt(avg));

        return dev;
    }

    public static int findMode(ArrayList<Integer> nums)
    {
        int most =0;


        for(int x=1;x<=100;x++)
        {
            int count =0;
            for(int y=0;y<100;y++)
            {
                if(nums.get(y)==x)
                    count++;
            }

            if(count>most)
                most=x;
        }

        return most;
    }
}
