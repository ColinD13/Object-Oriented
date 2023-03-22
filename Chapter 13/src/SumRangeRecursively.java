import java.util.Scanner;

public class SumRangeRecursively {
    public static void main(String[] args) {
        int[] nums = new int[20];
        Scanner sc = new Scanner(System.in);
        int one =0;
        int two =0;

        do{
            System.out.println("Enter the starting num");
            one = sc.nextInt();
        }while(one<0 || one>nums.length);

        do{
            System.out.println("Enter the ending num");
            two = sc.nextInt();
        }while(two<=one || two>nums.length);

        for(int x=0;x<nums.length;x++)
        {
            nums[x]=x+1;
        }

//        display(one,two,nums);
        System.out.println(sum(one,two,nums));

        sc.close();
    }

    public static int display(int one, int two,int[] nums)
    {
        if(one<two)
        {
            System.out.println(nums[one] + " ");
            return display(++one,two,nums);
        }
        else
            return 0;
    }

    public static int sum(int one, int two, int[] nums)
    {
        if(two>one)
            return nums[two] + sum(one,two-1,nums);
        else
            return nums[two];
    }


}
