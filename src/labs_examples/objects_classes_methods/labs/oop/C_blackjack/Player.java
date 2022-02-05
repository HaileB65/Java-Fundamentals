package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class Player {
    String name;
    Hand hand;
    int potValue;
    int playerWallet;
    int betValue;

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
        int playerBetValue = wantToPlaceBet.nextInt(); // saves players answer value to int "playerBetValue"

        betValue = playerBetValue + betValue;

        player.playerWallet = player.playerWallet - betValue;
        potValue = potValue + betValue;

        System.out.println("Current pot value" + potValue);
    }

    public void computerPlaceBet(Player player){
        int computerBet = (int) (Math.random() * (playerWallet)+1);

        betValue = computerBet + betValue;

        player.playerWallet = player.playerWallet - betValue;
        potValue = potValue + betValue;

        System.out.println("Current pot value" + potValue);
    }

    @Override
    public String toString() {
        return
                 name + ", " + hand + "player wallet= " + ", " + playerWallet + ", potValue=" + potValue;
    }
}
