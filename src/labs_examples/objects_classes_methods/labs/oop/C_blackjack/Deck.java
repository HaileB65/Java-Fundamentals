package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck {
    String[] suit = {"♠", "♦", "♥", "♣"};
    Card[] cards = new Card[52];

    ArrayList<Integer> usedCards = new ArrayList<>();

    public void setDeck(){
        int counter = 0;
        for(int i=0; i<=3; i++){
            for(int j=1; j < 14; j++) {
                if(j == 1) {
                    cards[counter] = new Card("ACE", suit[i]);
                }else if(j == 11) {
                    cards[counter] = new Card("JACK", suit[i]);
                }else if(j == 12) {
                    cards[counter] = new Card("QUEEN", suit[i]);
                }else if(j == 13) {
                    cards[counter] = new Card("KING", suit[i]);
                }else{
                    cards[counter] = new Card(Integer.toString(j), suit[i]);
                }
                counter++;
            }
        }

    }

    public void deal(Player player1){
        int random;

        do{
            random = (int) Math.random()*(52)+1;

        }while(!usedCards.contains(random));

    }

    public Card[] getCards(){
        return cards;
    }

}
