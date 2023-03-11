public class IncomingCall extends PhoneCall{
    public IncomingCall(String num) {
        super(num);
        setPrice(2);
    }

    @Override
    public String getNum() {
        return num;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getInfo() {
        return "IncomingCall{" +
                "num='" + num + '\'' +
                ", price=" + price +
                ", rate=" +price + '}';
    }
}
