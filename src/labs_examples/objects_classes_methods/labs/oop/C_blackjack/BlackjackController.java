package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {
    public static void main(String[] args) {

        Deck one = new Deck();

        one.setDeck();

        for(Card c : one.getCards()){
            System.out.println(c.toString());
        }
    }
}
