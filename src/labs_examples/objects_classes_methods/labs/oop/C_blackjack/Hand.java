package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards = new ArrayList<>();
    public int handValue;

    public int getScore(){
        int sum = 0;

        for(Card c : cards) {
            sum += c.cardValue;
        }

        handValue = sum;

        return sum;
    }

    public boolean greaterThan21(int handvalue){
        if (handvalue > 21) {
            System.out.println("handvalue " + handvalue + " is over 21");
            return true;
        }else {
            System.out.println("handvalue " + handvalue + " is under 21");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Hand {" +
                "cards=" + cards +
                ", handValue=" + handValue +
                '}';
    }
}
