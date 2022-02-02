package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Card {
    String suit;
    int cardValue;

    public Card(int cardValue, String suit){
        this.cardValue = cardValue;
        this.suit = suit;

    }

    @Override
    public String toString() {
        return "Card{" +
                "cardValue=" + cardValue +
                ", suit=" + suit +
                '}';
    }

}
