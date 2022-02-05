package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Objects;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {

        System.out.println("Playing blackjack");
        playBlackJack();

    }

    public static void playBlackJack(){
        System.out.println("Starting black jack game.");

        Hand playerHand = new Hand(); // creating hand for computer and player
        Hand computerHand = new Hand();

        Scanner newPlayerName = new Scanner(System.in); // this block of code asks player to enter name and bet value
        System.out.print("Enter player name: ");
        String name = newPlayerName.next();
        Scanner newPlayerWalletValue = new Scanner(System.in); // starts a scanner to scan for players answer
        System.out.print("Place bet value: ");
        int playerWallet = newPlayerWalletValue.nextInt(); // saves players answer value to int "playerWallet"

        Player player = new Player(name,playerHand,playerWallet); // creating player and computer players
        Player computer = new Player("Computer",computerHand, playerWallet);

        Deck deck = new Deck(); // creates a deck object
        deck.setDeck(); // creates a deck of cards

        System.out.println(player.name + " vs " + computer.name);
        System.out.println();

        player.playerPlaceBet(player);
        player.computerPlaceBet(computer);

        deck.deal(player); // deals player and computer two cards each
        deck.deal(player);
        deck.deal(computer);
        deck.deal(computer);

        System.out.println(player); // prints out player and computer cards and handValues
        System.out.println(computer);

        while((player.hand.handValue < 21) && (computer.hand.handValue < 21)) { // continues to ask player if they want a new card
            System.out.println();
            Scanner dealNextCard = new Scanner(System.in); // starts a scanner and asks player if they want a new card
            System.out.print("Deal player next card?");
            String dealNextCardAnswer = dealNextCard.next();  // saves players answer to String "dealNextCardAnswer"

            if(Objects.equals(dealNextCardAnswer, "yes")) {  // gives player a new card or prints "out did not want a new card"
                deck.deal(player);
                System.out.println(player.name + " handValue= " + player.hand.handValue);
            }else if(Objects.equals(dealNextCardAnswer, "no")) {
                System.out.println(player.name + " did not want a new card");
            }

            if (computer.computerAI(computer) == true) {  // ask computer if they want a new card
                System.out.println();
                deck.deal(computer);
                System.out.println("Computer dealt new card");
                System.out.println(computer.name + " handValue= " + computer.hand.handValue);
            }else if(computer.computerAI(computer) == false) {
                System.out.println(computer.name + " did not want a new card");
            }

            if((Objects.equals(dealNextCardAnswer, "no") && (computer.computerAI(computer) == false))){ // breaks while loop
                break;                                                                                     // when both user and computer
            }                                                                                              // say no to a new card
        }

        System.out.println();
        System.out.println("Game finished!");
        System.out.println();
        System.out.println("Game scores:");
        System.out.println(player.name + " handValue= " + player.hand.handValue + ", money= " + playerWallet);
        System.out.println(computer.name + " handValue= " + computer.hand.handValue + ", money= " + playerWallet);

        if(computer.hand.handValue > 21){
            System.out.println("Player handValue over 21. Player busted!");
            System.out.println(player.name + " handValue= " + player.hand.handValue);
        }
        if(computer.hand.handValue > 21){
            System.out.println("Computer handValue over 21. Computer busted!");
            System.out.println(computer.name + " handValue= " + computer.hand.handValue);
        }

        if(player.hand.handValue == 21 ){
            System.out.println(player.name + " won the game!");
        }else if(computer.hand.handValue == 21){
            System.out.println(computer.name + " won the game!");
        }else if(player.hand.handValue < 21 && player.hand.handValue > computer.hand.handValue){
            System.out.println(player.name + " won the game!" + "wins $" + player.potValue);
        }else if(computer.hand.handValue < 21 && computer.hand.handValue > player.hand.handValue) {
            System.out.println(computer.name + " won the game!");
        }



    }

}
