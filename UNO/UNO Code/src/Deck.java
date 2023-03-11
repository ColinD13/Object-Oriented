public class Deck {
    protected Card topCard = new Card();

    protected int cardsInDeck;

    public Deck(Card topCard, int cardsInDeck) {
        this.topCard = topCard;
        this.cardsInDeck = cardsInDeck;
    }

    public Deck() {
    }

    public Card getTopCard() {
        return topCard;
    }

    public int getCardsInDeck() {
        return cardsInDeck;
    }

    public void setCardsInDeck(int cardsInDeck) {
        this.cardsInDeck = cardsInDeck;
    }
}
