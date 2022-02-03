package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {
    public static void main(String[] args) {

        Deck one = new Deck();
        Hand jacksHand = new Hand();

        Player Jack = new Player("Jack",jacksHand, 0);

        one.setDeck();
        for(Card c : one.getCards()){
            System.out.println(c.toString());
        }
        System.out.println("step 1 complete");


        one.deal(Jack);
        System.out.println("step 2 complete");

        System.out.println(Jack);

        Jack.hand.getScore();
        System.out.println(Jack.hand.getScore());

        System.out.println(Jack);

        Jack.hand.greaterThan21(Jack.hand.handValue);

    }
}
