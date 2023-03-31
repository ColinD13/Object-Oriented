public class Food extends Product{
    private String recieved;
    private String bad;

    public Food(String recieved, String bad,String productName,int quantity,float cost) {
        super(productName,quantity,cost);
        this.recieved = recieved;
        this.bad = bad;
    }

    public Food() {
    }

    public String getRecieved() {
        return recieved;
    }

    public void setRecieved(String recieved) {
        this.recieved = recieved;
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad;
    }

    @Override
    public String toString() {
        return super.toString() +
                "recieved='" + recieved + '\'' +
                ", bad='" + bad + '}';
    }

    public void displayDayBad()
    {
        System.out.println("This food goes bad on " + this.bad);
    }

    public static void main(String[] args) {
        Food f = new Food("March 1st","March 30","Ketchup",20, 4.99F);
        f.displayDayBad();
        System.out.println(f.toString());
    }
}
