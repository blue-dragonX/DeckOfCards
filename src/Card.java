public class Card {
    private int cardNumber;
    private String cardSuit;

    public Card(int cardNumber,String cardSuit){
        this.cardNumber=cardNumber;
        this.cardSuit=cardSuit;
    }

    public void print() {
        System.out.printf("%d%s\n",cardNumber,cardSuit);
    }
}
