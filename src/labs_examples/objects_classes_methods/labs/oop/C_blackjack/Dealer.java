package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Dealer extends Human {
    Deck deck = new Deck();
    public boolean computerAI(){
        if(super.hand.handValue < 16){
            return true;
        }else
            return false;
    }

    public void deal(Human player1){
        int random;

        do{
            random = (int) (Math.random() * (51)+1);

        }while(deck.usedCards.contains(random));

        player1.hand.cards.add(deck.cards[random]);

        deck.usedCards.add(random);

        player1.hand.getScore(); // runs getScore() method to give handValue variable a number
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "hand=" + hand +
                '}';
    }
}
