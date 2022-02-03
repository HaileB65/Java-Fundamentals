package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    String name;
    Hand hand;
    int potValue;

    public Player(String name, Hand hand, int potValue){
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;


    }

    public boolean computerAI(Player player1){
        if(player1.hand.handValue < 16){
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        return
                 name + ", " + hand + ", potValue=" + potValue;
    }
}
