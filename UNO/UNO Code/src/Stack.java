public class Stack {
    protected Card topCard = new Card();

    public Stack(Card topCard) {
        this.topCard = topCard;
    }

    public Stack() {
    }

    public Card getTopCard() {
        return topCard;
    }

    public void setTopCard(Card topCard) {
        this.topCard = topCard;
    }
}
