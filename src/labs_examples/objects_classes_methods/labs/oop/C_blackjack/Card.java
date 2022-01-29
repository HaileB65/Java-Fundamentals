package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    public char newSuit;
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;

    public Card(int cardValue, char newSuit){
        this.cardValue = cardValue;
        this.newSuit = newSuit;

    }
}
