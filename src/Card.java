public class Card {
    private final int cardNumber;
    private char cardStatus; //J,Q,K,A if needed
    private final String cardSuit;

    public Card(int cardNumber,String cardSuit){
        this.cardNumber=cardNumber;
        this.cardSuit=cardSuit;
        switch(cardNumber){
            case 11-> cardStatus = 'J';
            case 12-> cardStatus = 'Q';
            case 13-> cardStatus = 'K';
            case 14-> cardStatus = 'A';
            default->{}
        }

    }

    public void print() {
        if (cardNumber<=10)
        System.out.printf("%d%s\n",cardNumber,cardSuit);
       else
           System.out.printf("%c%s\n", cardStatus, cardSuit);
    }

}
