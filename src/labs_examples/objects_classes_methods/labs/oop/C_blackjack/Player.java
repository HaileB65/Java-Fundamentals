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

    @Override
    public String toString() {
        return
                 name + " " +
                "{" + hand +
                ", potValue=" + potValue +
                '}';
    }
}
