package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Deck {
    Card[] cards;
    ArrayList<Integer> usedCards;

    public void setDeck(){
        for(int i=2; i <=10; i++){
            Card j = new Card(i,'♠');
        }

        //Card one = new Card(1,'♠');
        //Card two = new Card(1,'♥');

        //cards[0] = one;
        //cards[1] = two;

    }
}
