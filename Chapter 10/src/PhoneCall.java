public abstract class PhoneCall {
    protected String num;
    protected double price;

    public PhoneCall() {
        this.num ="";
        this.price=0.0;
    }

    public PhoneCall(String num) {
        this.num = num;
        this.price=0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getNum();
    public abstract double getPrice();
    public abstract String getInfo();
}
