public class Card {

    protected int value;
    protected String color;
    protected String action;

    public Card(int value, String color) {
        this.value = value;
        this.color = color;
    }

    public Card() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public boolean isMatch(Card c1, Card c2)
    {
        if(c1.getValue()==c2.getValue() || c1.getColor()==c2.getColor())
            return true;
        else
            return false;
    }
}