import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    protected ArrayList<Card> cards = new ArrayList<Card>();
    private int cardsInDeck;

    public void newDeck()
    {
        ArrayList<Card> cardsToAdd = new ArrayList<Card>();
        Card.Color colors[] = Card.Color.values();
        Card.Value values[] = Card.Value.values();
        this.cardsInDeck=0;

        for(int x=0;x<=3;x++)
        {
            for(int y=1;y<=12;y++)
            {
                Card c = new Card(colors[x],values[y]);
                cardsToAdd.add(c);
            }
        }

        for(int x=0;x<=3;x++)
        {
            Card c= new Card(colors[x],values[0]);
            cardsToAdd.add(c);
        }

        for(int x=13;x<=14;x++)
        {
            Card c = new Card(colors[4],values[x]);
            cardsToAdd.add(c);
        }

        Collections.shuffle(cardsToAdd);

        this.cards = cardsToAdd;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getCardsInDeck() {
        return cardsInDeck;
    }



}

