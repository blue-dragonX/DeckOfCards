import java.util.ArrayList;
import java.util.LinkedList;

public class Hand {

    private ArrayList<Card> hand= new ArrayList<>();

    public ArrayList<Card> getHand() {
        return hand;
    }
    public void addToHand(Card cardReceived){
        hand.add(cardReceived);
    }

}
