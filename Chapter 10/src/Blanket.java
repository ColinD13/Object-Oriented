public class Blanket {
    protected String size;
    protected String color;
    protected String material;
    protected double price;

    public Blanket() {
        this.size = "Twin";
        this.color = "White";
        this.material ="Cotton";
        this.price = 30.00;
    }

    public void setSize(String size) {
        this.size = size;

        if(this.size.equalsIgnoreCase("Double"))
        {
            this.price+=10;
        }
        else if(this.size.equalsIgnoreCase("Queen"))
        {
            this.price+=25;
        }
        else if(this.size.equalsIgnoreCase("King"))
        {
            this.price+=45;
        }
        else
        {
            this.material = "Twin";
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;

        if(this.material.equalsIgnoreCase("Wool"))
        {
            this.price+=20;
        }
        else if(this.material.equalsIgnoreCase("Cashmere"))
        {
            this.price+=45;
        }
        else
        {
            this.material = "Cotton";
        }
    }


    @Override
    public String toString() {
        return "Blanket{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
