package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {

        Deck one = new Deck();
        Hand jacksHand = new Hand();

        Player jack = new Player("Jack",jacksHand, 0);
        Player computer = new Player("Computer",jacksHand, 0);

        one.setDeck();
        for(Card c : one.getCards()){
            System.out.println(c.toString());
        }
        System.out.println("step 1 complete");


        one.deal(jack);
        System.out.println("step 2 complete");

        System.out.println(jack); // prints out player info
        jack.hand.greaterThan21(jack.hand.handValue); // runs greaterThan21() method on player1 hand value
        System.out.println("step 3 complete");


        jack.computerAI(jack); // check player's hand to see if they want another card
        System.out.println("step 4 complete");

        playBlackJack();

    }

    public static void playBlackJack(){

        System.out.println();
        Scanner newPlayerName = new Scanner(System.in); // starts a scanner to scan for new players name
        System.out.print("Enter player name: ");
        String name = newPlayerName.next(); // saves players name to String "name"


        Hand playerHand = new Hand(); // creating hand for computer and player
        Hand computerHand = new Hand();

        Player player = new Player(name,playerHand, 0); // creating player and computer players
        Player computer = new Player("Computer",computerHand, 0);

        System.out.println(player.name + " vs " + computer.name);
        System.out.println();

        Deck deck = new Deck(); // creates a deck object
        deck.setDeck(); // creates a deck of cards

        deck.deal(player); // deals player and computer two cards each
        deck.deal(player);
        deck.deal(computer);
        deck.deal(computer);

        System.out.println(player); // prints out player and computer cards and handValues
        System.out.println(computer);

        while(player.hand.handValue < 21) { // continues to ask player if they want a new card
            System.out.println();
            Scanner dealNextCard = new Scanner(System.in); // starts a scanner and asks player if they want a new card
            System.out.println("Deal player next card?");
            String dealNextCardAnswer = dealNextCard.next();  // saves players answer to String "dealNextCardAnswer"

            if(Objects.equals(dealNextCardAnswer, "yes")) {  // gives player a new card or prints "out did not want a new card"
                deck.deal(player);
                System.out.println(player.name + " handValue= " + player.hand.handValue);
            }else if(Objects.equals(dealNextCardAnswer, "no")) {
                System.out.println(player.name + " did not want a new card");
                break;
            }
        }

        System.out.println("Player handValue over 21. Player busted!");

        while(computer.hand.handValue < 21){ // continues to ask computer if they want a new card
            if (computer.computerAI(computer) == true) {  // ask computer if they want a new card
                System.out.println();
                deck.deal(computer);
                System.out.println("Computer dealt new card");
                System.out.println(computer.name + " handValue= " + computer.hand.handValue);
            }else {
                System.out.println(computer.name + " did not want a new card");
                break;
            }
        }
        System.out.println("Computer handValue over 21. Computer busted!");


        System.out.println();
        System.out.println(player.name + " handValue= " + player.hand.handValue);
        System.out.println(computer.name + " handValue= " + computer.hand.handValue);

        System.out.println();
        if (player.hand.handValue <= 21){
            System.out.println(player.name + " won the game!");
        } else if(computer.hand.handValue <= 21) {
            System.out.println(computer.name + " won the game!");
        }else if(player.hand.handValue > computer.hand.handValue){
            System.out.println(computer.name + " won the game!");
        }else if(computer.hand.handValue > player.hand.handValue){
            System.out.println(player.name + " won the game!");
        }









    }

}
