import java.util.ArrayList;

public class Player {

    protected ArrayList<Card> hand = new ArrayList<>();
    private int cardsInHand;

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(int cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

}
