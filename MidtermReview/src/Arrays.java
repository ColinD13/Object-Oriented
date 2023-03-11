public class Arrays {
    public static void main(String[] args) {
        double[] nums = {3.4545,2.4565,7.435345,1.23432,9.2434};
//        double avg=0;
//
//        for(int x =0;x<nums.length;x++)
//        {
//            avg+=nums[x];
//        }
//        avg=avg/nums.length;
//        System.out.println(avg);
//
//        double max = nums[0];
//        for(int x=0; x<nums.length;x++)
//        {
//            if(nums[x]>max)
//                max=nums[x];
//        }
//        System.out.println(max);
//
//        double min = nums[0];
//        for(int x=0; x<nums.length;x++)
//        {
//            if(nums[x]<min)
//                min=nums[x];
//        }
//        System.out.println(min);

        boolean check = false;
        double n = 1.23432;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]==n)
                check=true;
        }
        if(check==true)
            System.out.println(n + " is in the array");
        else
            System.out.println(n + " is not in the array");


    }
}
