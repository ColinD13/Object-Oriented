public class Player {

    protected int cardsInHand;

    public Player(int cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public Player() {
    }

    public int getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(int cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public void drawCard(Deck d)
    {
        this.setCardsInHand(this.getCardsInHand()+1);
        d.setCardsInDeck(d.getCardsInDeck()-1);
    }

    public void playCard(Stack s,Card c)
    {
        this.setCardsInHand(this.getCardsInHand()-1);
        s.setTopCard(c);
    }
}
