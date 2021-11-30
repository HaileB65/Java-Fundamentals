package labs_examples.arrays.labs;
import java.util.Scanner;
/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in); // create scanner
        System.out.print("Enter ten numbers on the same line with a space between each number: "); // gives user a prompt
        int[] survey = new int[10]; // creates an array with a size of 10

        for(int i=0; i<survey.length; i++){ // i < survey.length decides how many numbers will be collected before entering them into the array
            survey[i] = userInput.nextInt(); // places each integer the user enters into the next array index
            // System.out.println();
        }
        for(int  j=0; j <survey.length; j++){
            System.out.print(survey[j] + " | "); // prints out each element in the array
        }
        System.out.println();

        int sum = 0;
        for (int i : survey) {
            sum += i; // can be written as sum = sum + i. Calculates the sum of the elements in the array.
        }
        System.out.println("sum = " + sum);

        int average = sum / 10; // calculates the average of the elements in the array
        System.out.println("average = " + average);

    }

}