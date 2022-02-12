package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player extends Human {
    String name;
    static int potValue;
    int wallet;
    int betValue;

    public Player(String name, int playerWallet){
        this.name = name;
        this.wallet = playerWallet;
    }

    public void placeBet(){
        Scanner wantToPlaceBet = new Scanner(System.in); // starts a scanner to scan for players answer
        System.out.print("Place bet value: ");
        betValue = wantToPlaceBet.nextInt(); // saves players answer value to int "playerBetValue"

        wallet = wallet - betValue;
        potValue += betValue;

        System.out.print("Player placed a bet.");
        System.out.print(" Current pot value= " + potValue + "\n");
    }


    @Override
    public String toString() {
        return
                 name + ", " + hand + ", player wallet= " + wallet;
    }
}
