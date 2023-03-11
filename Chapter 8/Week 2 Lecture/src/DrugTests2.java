import java.util.Arrays;

public class DrugTests2 {
    public static void main(String[] args) {
            int[] randomTest = new int[52];
            int test;

            for(int x=0;x<randomTest.length;x++)
            {
                test= 1+ (int)(Math.random()*30);
                randomTest[x]= test;

                System.out.print("Employee: "+ randomTest[x] + " ");

                if((x+1)%4==0)
                {
                    System.out.println();
                }
            }

            int count =0;

            for(int y =0;y<30;y++)
            {
                count =0;

                for(int i =0;i<30;i++)
                {
                    if(randomTest[i]==(y+1))
                    {
                        count++;
                    }
                }

                if(count==0)
                {
                    System.out.println("Employee "+ (y+1) + " is not in list");
                }
                else
                {
                    System.out.println("Employee "+ (y+1) + " was tested " + count + " times");
                }

            }

    }
}
