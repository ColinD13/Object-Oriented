public class JunkFood extends Food{
    protected double fat;
    protected double sugar;

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public JunkFood(String name, int calories, double fat, double sugar) {
        super(name, calories);
        this.fat = fat;
        this.sugar = sugar;
    }

    public JunkFood() {
        super();
        this.fat=0.0;
        this.sugar=0.0;
    }

    @Override
    public String toString() {
        return super.toString()+ " : "+ this.fat + " fat " + " : " + this.sugar + " sugar";
    }
}
