public class TestLoadedDie {
    public static void main(String[] args) {
        int count1=0;
        int count2=0;

        for(int x =0;x<1000;x++)
        {
            Die d = new Die();
            Die test = new Die();
            Die d2 = new Die();
            LoadedDie ld2 = new LoadedDie();

            if(d.getVal()>test.getVal())
            {
                count1++;
            }

            if(d2.getVal()>ld2.getVal())
            {
                count2++;
            }
        }

        System.out.println("The first die rolled a higher number "+ count1 + " times");
        System.out.println("The second die rolled a higher number "+ count2 + " times");
    }
}
