import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Deck d = new Deck();
        Player p1 = new Player();
        Player p2 = new Player();
        ArrayList<Card> deck = new ArrayList<Card>();
        d.newDeck();
        System.out.println(d.cards);

        for(int x=0;x<7;x++) {
            p1.hand.add(d.cards.get(0));
            d.cards.remove(0);
        }

        for(int x=0;x<7;x++) {
            p2.hand.add(d.cards.get(0));
            d.cards.remove(0);
        }

        System.out.println(p1.hand);
        System.out.println(p2.hand);
    }
}
