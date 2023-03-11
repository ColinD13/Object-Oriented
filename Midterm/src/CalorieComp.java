public class CalorieComp extends Food implements Comparable<Food>{

    public int compareCal(Food f1,Food f2)
    {
        return (int) (f1.getCalories()- f2.getCalories());
    }
}