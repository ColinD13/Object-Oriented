public class ScentedCandle extends Candle{
    private String scent;

    public ScentedCandle(String color, double height, String scent) {
        super();
        setHeight(height);
        setColor(color);
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
    @Override
    public void setHeight(double height)
    {
        super.height =height;
        super.price = height * 3;
    }

    @Override
    public String toString() {
        return super.toString() + "ScentedCandle{" +
                "scent='" + scent + '\'' +
                '}';
    }
}
