public class NameComp extends Food implements Comparable<Food>{

    public int compareNames(Food f1,Food f2)
    {
        return f1.getName().compareTo(f2.getName());
    }
}
