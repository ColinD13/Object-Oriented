public class Card {

    enum Color{
        Red,Blue,Green,Yellow,Wild;
    }

    enum Value{
        Zero,One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Skip,D2,Reverse,Wild,W4;
    }

    private final Color color;
    private final Value value;

    public Card(Color color,Value value)
    {
        this.color = color;
        this.value = value;
    }

    public Card() {
        this.color=Color.Blue;
        this.value=Value.One;
    }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Card{" +
                "color=" + color +
                ", value=" + value +
                '}';
    }
}