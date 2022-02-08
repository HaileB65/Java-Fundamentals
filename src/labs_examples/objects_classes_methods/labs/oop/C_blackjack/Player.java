package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    String name;
    Hand hand;
    int potValue;
    int playerWallet;
    int playerBetValue;
    int computerBetValue;

    public Player(String name, Hand hand, int playerWallet){
        this.name = name;
        this.hand = hand;
        this.playerWallet = playerWallet;
    }

    public boolean computerAI(Player player1){
        if(player1.hand.handValue < 16){
            return true;
        }else
            return false;
    }

    public void playerPlaceBet(Player player){
        Scanner wantToPlaceBet = new Scanner(System.in); // starts a scanner to scan for players answer
        System.out.print("Place bet value: ");
        playerBetValue = wantToPlaceBet.nextInt(); // saves players answer value to int "playerBetValue"

        player.playerWallet = player.playerWallet - playerBetValue;
        potValue = potValue + playerBetValue;

        System.out.print("Player placed a bet.");
        System.out.print(" Current pot value= " + potValue + "\n");
    }

    public void computerPlaceBet(Player computer){
        computerBetValue = playerBetValue;

        computer.playerWallet = computer.playerWallet - computerBetValue;
        potValue = potValue + computerBetValue;

        System.out.print("Computer placed bet.");
        System.out.print(" Current pot value= " + potValue);
        System.out.println();
    }

    @Override
    public String toString() {
        return
                 name + ", " + hand + ", player wallet= " +  playerWallet;
    }
}
