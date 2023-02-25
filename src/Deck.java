import java.util.*;

public class Deck {

    private Queue<Card> deckOfCards = new LinkedList<>();

    public Deck(){
        for(Suit suit: Suit.values()){
            for(int i =2; i<=14;i++){
            switch(suit){
                    case Clubs ->  deckOfCards.add(new Card(i,"♠"));
                    case Hearts -> deckOfCards.add(new Card(i,"♥"));
                    case Spades -> deckOfCards.add(new Card(i,"♣"));
                    case Diamonds->deckOfCards.add(new Card(i,"♦"));
                    default -> {System.out.println("Card handling error\n");}
                }
            }
        }
    }
    public void print(){
        deckOfCards.forEach(Card::print);
    }
    public void shuffleDeck() {
        Collections.shuffle((List<?>) deckOfCards);
    }

    public Queue<Card> getDeckOfCards() {
        return deckOfCards;
    }
}
