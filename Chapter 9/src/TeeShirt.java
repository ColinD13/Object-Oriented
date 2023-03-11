public class TeeShirt {
    private String on;
    private String size;
    private String color;
    private double price;

    public TeeShirt(String on, String size, String color) {
        this.on = on;
        this.size = size;
        this.color = color;

        if(this.size.equalsIgnoreCase("XXL") || this.size.equalsIgnoreCase("XXXL"))
        {
            this.price=22.99;
        }
        else
        {
            this.price = 19.99;
        }
    }

    public TeeShirt() {
        this.on = "";
        this.size = "";
        this.color = "";
        this.price = 0.0;
    }

    public void setOn(String on) {
        this.on = on;
    }

    public void setSize(String size) {
        this.size = size;

        if(this.size.equalsIgnoreCase("XXL") || this.size.equalsIgnoreCase("XXXL"))
        {
            this.price=22.99;
        }
        else
        {
            this.price = 19.99;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOn() {
        return on;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TeeShirt{" +
                "on='" + on + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
