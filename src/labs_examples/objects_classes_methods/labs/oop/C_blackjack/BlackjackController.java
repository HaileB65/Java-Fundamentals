package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Objects;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        System.out.println("Starting black jack game.");
        System.out.println();
        playBlackJack();

    }

    public static void playBlackJack(){
        Hand playerHand = new Hand(); // creating hand for computer and player
        Hand computerHand = new Hand();

        Scanner newPlayerName = new Scanner(System.in); // this block of code asks player to enter name and player wallet total
        System.out.print("Enter player name: ");
        String name = newPlayerName.next();
        Scanner newPlayerWalletValue = new Scanner(System.in);
        System.out.print("Player wallet total: ");
        int playerWallet = newPlayerWalletValue.nextInt(); // saves players answer value to int "playerWallet"

        Player player = new Player(name,playerHand, playerWallet); // creating player and computer players
        Player computer = new Player("Computer",computerHand, playerWallet);

        System.out.println("Player wallet= " + player.playerWallet);
        System.out.println("Computer wallet= " + computer.playerWallet);

        Deck deck = new Deck(); // creates a deck object
        deck.setDeck(); // creates a deck of cards

        System.out.println();
        System.out.println(player.name + " vs " + computer.name);
        System.out.println();

        while((player.playerWallet > 0) && (computer.playerWallet> 0)) {

            player.playerPlaceBet(player);
            player.computerPlaceBet(computer);

            deck.deal(player); // deals player and computer two cards each
            deck.deal(player);
            deck.deal(computer);
            deck.deal(computer);

            System.out.println();
            System.out.println(player); // prints out player and computer cards and handValues
            System.out.println(computer);
            System.out.println("Current pot value= " + player.potValue);

            while ((player.hand.handValue < 21) && (computer.hand.handValue < 21)) { // continues to ask player if they want a new card
                System.out.println();
                Scanner dealNextCard = new Scanner(System.in); // starts a scanner and asks player if they want a new card
                System.out.print("Deal player next card?");
                String dealNextCardAnswer = dealNextCard.next();  // saves players answer to String "dealNextCardAnswer"

                if (Objects.equals(dealNextCardAnswer, "yes")) {  // gives player a new card or prints "out did not want a new card"
                    deck.deal(player);
                    System.out.println(player.name + " handValue= " + player.hand.handValue);
                } else if (Objects.equals(dealNextCardAnswer, "no")) {
                    System.out.println(player.name + " did not want a new card");
                }


                if (computer.computerAI(computer) == true) {  // ask computer if they want a new card
                    System.out.println();
                    deck.deal(computer);
                    System.out.println("Computer dealt new card");
                    System.out.println(computer.name + " handValue= " + computer.hand.handValue);
                } else if (computer.computerAI(computer) == false) {
                    System.out.println(computer.name + " did not want a new card");
                }

                if ((Objects.equals(dealNextCardAnswer, "no") && (computer.computerAI(computer) == false))) { // breaks while loop
                    break;                                                                                     // when both user and computer
                }                                                                                              // say no to a new card
            }

            System.out.println();
            System.out.println("Round finished!");
            System.out.println();
            System.out.println("Round scores:");
            System.out.println(player.name + " handValue= " + player.hand.handValue + ", Remaining wallet= " + (player.playerWallet));
            System.out.println(computer.name + " handValue= " + computer.hand.handValue + ", Remaining wallet= " + (computer.playerWallet - computer.computerBetValue));
            System.out.println();

            if (player.hand.handValue > 21) {
                System.out.println("Player handValue over 21. Player busted!");
            }
            if (computer.hand.handValue > 21) {
                System.out.println("Computer handValue over 21. Computer busted!");
            }

            if (player.hand.handValue <= 21) {
                System.out.println(player.name + " won the game and wins $" + player.potValue);
            }
            if (computer.hand.handValue <= 21) {
                System.out.println(computer.name + " won the game and wins $" + player.potValue);
            }

            System.out.println();
            System.out.println("Next round");

        }

        System.out.println();
        System.out.println("Game finished player or computer out of money.");
        System.out.println(player.name + " remaining wallet= " + (player.playerWallet));
        System.out.println(computer.name + " remaining wallet= " + (computer.playerWallet));




    }

}