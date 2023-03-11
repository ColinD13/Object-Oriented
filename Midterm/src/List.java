import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        int[] nums = new int[20];
        int count=0;

        for(int x=0;x<nums.length;x++)
        {
            nums[x]=(int) (Math.random()*10)+1;
        }

        for(int x=0;x<nums.length;x++) {
            if (nums[x] == 5)
                count++;
        }

        System.out.println("There are "+ count + " 5's in the array");
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
