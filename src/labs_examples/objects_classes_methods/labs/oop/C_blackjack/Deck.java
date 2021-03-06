package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck {
    String[] suit = {"♠", "♦", "♥", "♣"};
    Card[] cards = new Card[52];

    ArrayList<Integer> usedCards = new ArrayList<>();

    public Deck(){
        setDeck();
    }

    public void setDeck(){
        int counter = 0;
        for(int i=0; i<=3; i++){
            for(int j=1; j < 14; j++) {
                    cards[counter] = new Card(j, suit[i]);
                counter++;
            }
        }

    }

    public Card[] getCards(){
        return cards;
    }

}
