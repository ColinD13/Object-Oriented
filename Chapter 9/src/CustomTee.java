public class CustomTee extends TeeShirt{

    private String slogan;

    public CustomTee(String on, String size, String color, String slogan) {
        super(on, size, color);
        this.slogan = slogan;
    }

    public CustomTee() {
        super();
        this.slogan = "";
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Slogan='" + slogan + '\'' +
                '}';
    }
}
