import java.util.Arrays;

public class DrugTest3 {
    public static void main(String[] args) {
        int[] empl = new int[52];
        int test;

        empl[0]= 1+ (int)(Math.random()*30);

        for(int x=1;x<empl.length;x++)
        {
            test= 1+ (int)(Math.random()*30);

            if(test==empl[x-1])
            {
                System.out.println("Repeat from last week new number selected");
                test++;
            }

            empl[x]=test;
        }

        System.out.println(Arrays.toString(empl));
    }
}
