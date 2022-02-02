package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;
    int handValue;

    public int addScore() {
        int sum = 0;

        for(Card c : cards) {
            sum += c.cardValue;
        }

        sum = handValue;

        return sum;
    }

}
