package com.mycompany.unonet;

public class Card{

    enum Color{
        Red,BLue,Green,Yellow,Wild;

        private static final Color[] colors = Color.values();
        public static Color getColor(int i)
        {
            return Color.colors[i];
        }
    }//end of enum color

    enum Value{

        Zero,One,Two,Three,Four,Five,Six,Seven,Eight,Nine,D2,Skip,Reverse,Wild,W4;
        private static final Value[] values = Value.values();
        public static Value getValue(int i)
        {
            return Value.values[i];
        }
    }//end of enum Value

    private final Color color;
    private final Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return this.color;
    }

    public Value getValue() {
        return this.value;
    }

    public String toString()
    {
        return color + " " + value;
    }
}