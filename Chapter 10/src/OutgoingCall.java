public class OutgoingCall extends PhoneCall{

    private int minutes;

    public OutgoingCall(String num, int minutes) {
        super(num);
        this.minutes = minutes;
        this.price = minutes*4;
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
        return "OutgoingCall{" +
                "minutes=" + minutes +
                "num='" + num + '\'' +
                ", price=" + price +
                ", rate=" +(price/minutes) + '}';
    }
}
