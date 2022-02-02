package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {
    public static void main(String[] args) {

        Deck one = new Deck();
        Hand two = new Hand();

        Player Jack = new Player("Jack",two);

        one.setDeck();
        for(Card c : one.getCards()){
            System.out.println(c.toString());
        }
        System.out.println("step 1 complete");

        one.deal(Jack);
        System.out.println("step 2 complete");

        two.addScore();
        System.out.println("step 3 complete");

        System.out.println(two.handValue);
        System.out.println("step 4 complete");
    }
}
