package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Objects;
import java.util.Scanner;

public class BlackjackController {
    static Player player; // creating player and computer players
    static Dealer dealer = new Dealer();
    static int numbOfGamesPlayed;
    static int gamesPlayerWon;
    static int gamesDealerWon;

    public static void main(String[] args) {
        System.out.println("Starting black jack game.");
        System.out.println();
        playBlackJack();
    }

    public static void playBlackJack(){
        collectUserInfoAndPrint();

        System.out.println();
        System.out.println(player.name + " vs Computer" );
        System.out.println();

        while((player.wallet > 0)) {

            player.placeBet();

            dealCards();

            printRoundResults();
            numbOfGamesPlayed++;
            System.out.println();
            System.out.println("Next round");
            System.out.println("Number of games played= " + numbOfGamesPlayed); 

        }

        System.out.println();
        System.out.println("Game finished player or computer out of money.");
        System.out.println(player.name + " remaining wallet= " + (player.wallet));
        System.out.println("Total number of games played= " + numbOfGamesPlayed);
        System.out.println("Games won by player= " + gamesPlayerWon);
        System.out.println("Games won by dealer= " + gamesDealerWon);


    }

    public static void collectUserInfoAndPrint(){
        Scanner newPlayerName = new Scanner(System.in); // this block of code asks player to enter name and player wallet total
        System.out.print("Enter player name: ");
        String name = newPlayerName.next();
        Scanner newPlayerWalletValue = new Scanner(System.in);
        System.out.print("Player wallet total: ");
        int playerWallet = newPlayerWalletValue.nextInt(); // saves players answer value to int "playerWallet"


        player = new Player(name, playerWallet); // creating player and computer players
        dealer = new Dealer();

        System.out.println("Player wallet= " + player.wallet);

    }

    public static void dealCards() {
        dealer.deal(player); // deals player and computer two cards each
        dealer.deal(player);
        dealer.deal(dealer);
        dealer.deal(dealer);

        System.out.println();
        System.out.println(player); // prints out player and computer cards and handValues
        System.out.println(dealer);
        System.out.println("Current pot value= " + player.potValue);

        while ((player.hand.handValue < 21) && (dealer.hand.handValue < 21)) { // continues to ask player if they want a new card
            System.out.println();
            Scanner dealNextCard = new Scanner(System.in); // starts a scanner and asks player if they want a new card
            System.out.print("Deal player next card?");
            String dealNextCardAnswer = dealNextCard.next();  // saves players answer to String "dealNextCardAnswer"

            if (Objects.equals(dealNextCardAnswer, "yes")) {  // gives player a new card or prints "out did not want a new card"
                dealer.deal(player);
                System.out.println(player.name + " handValue= " + player.hand.handValue);
            } else if (Objects.equals(dealNextCardAnswer, "no")) {
                System.out.println(player.name + " did not want a new card");
            }


            if (dealer.computerAI() == true) {  // ask computer if they want a new card
                System.out.println();
                dealer.deal(dealer);
                System.out.println("Computer dealt new card");
                System.out.println(dealer + " handValue= " + dealer.hand.handValue);
            } else if (dealer.computerAI() == false) {
                System.out.println(dealer + " did not want a new card");
            }

            if ((Objects.equals(dealNextCardAnswer, "no") && (dealer.computerAI() == false))) { // breaks while loop
                break;                                                                                     // when both user and computer
            }                                                                                              // say no to a new card
        }
    }

    public static void printRoundResults(){
        System.out.println();
        System.out.println("Round finished!");
        System.out.println();

        if (player.hand.handValue > 21) {
            System.out.println("Player handValue over 21. Player busted!");
            printScores();
            return;
        }
        if (dealer.hand.handValue > 21) {
            System.out.println("Computer handValue over 21. Computer busted!");
            player.wallet += player.potValue * 2;
            printScores();
            return;
        }

        if (player.hand.handValue > dealer.hand.handValue) {
            gamesPlayerWon++;
            System.out.println(player.name + " won the game and wins $" + player.potValue);
            player.wallet += player.potValue * 2;
        }else {
            System.out.println("Dealer won the game and wins $" + player.potValue);
            gamesDealerWon++;
        }

        printScores();

        player.hand = new Hand();
        dealer.hand = new Hand();
    }

    public static void printScores(){
        player.potValue = 0;

        System.out.println("Round scores:");
        System.out.println(player.name + " handValue= " + player.hand.handValue + ", Remaining wallet= " + (player.wallet));
        System.out.println("Dealer handValue= " + dealer.hand.handValue);
        System.out.println();
    }

}
