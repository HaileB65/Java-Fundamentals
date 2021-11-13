package labs_examples.conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args){
        Scanner enteredWord = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = enteredWord.nextLine();


        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) == 'a'|| word.charAt(i) == 'e'|| word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                System.out.println("Word entered: " + word);
                System.out.println("First vowel in word: " + word.charAt(i) + " at the index "+i);
            }
        }






    }
}
