import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffleDeck();
        Hand player1 = new Hand();
        Hand player2 = new Hand();
        for(int i=0; i<=7;i++){
            for (Hand hand : Arrays.asList(player1, player2)) {
                hand.addToHand(deck.getDeckOfCards().poll());
            }
        }
        player1.getHand().forEach(Card::print);
        System.out.println("__________________");
        player2.getHand().forEach(Card::print);
    }
}