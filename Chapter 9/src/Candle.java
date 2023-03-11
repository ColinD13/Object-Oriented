public class Candle {
    private String color;
    protected double height;
    protected double price;

    public Candle(String color, double height) {
        this.color = color;
        this.height = height;
        this.price = this.height*2;
    }
    public Candle() {
        this.color = "";
        this.height = 0.0;
        this.price = 0.0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.price = height*2;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Candle{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", price=" + price +
                '}';
    }
}
