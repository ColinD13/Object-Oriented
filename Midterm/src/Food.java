public class Food implements Comparable<Food> {
    protected String name;
    protected int calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if(calories<0)
            this.calories = 0;
        else
            this.calories = calories;
    }

    public Food(String name, int calories) {
        this.name = name;

        if(calories<0)
            this.calories = 0;
        else
            this.calories = calories;
    }

    public Food() {
        this.name = "";
        this.calories=0;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.calories + " calories";
    }


    @Override
    public int compareTo(Food f) {
        return this.name.compareTo(f.name);
    }


}