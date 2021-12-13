package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a = 64;
        int b = 8;
        String v = "";
        double c = 0;
        String e = "Hello New World!";




        int x = multiply(a, b);
        System.out.println("Using Multiply Method: x = " + x);
        int y = divide(a, b);
        System.out.println("Using Divide Method: y = " + y);

        userEnteredJoke(v); // using void method

        double sec = yearsToSeconds(c);
        System.out.println("There are " + sec + " seconds in the number of years you entered.");

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a*b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void userEnteredJoke(String v){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Using void method: Enter your favorite joke: ");
        v = scanner.next();
        System.out.println("Entered joke:"+ v);
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static double yearsToSeconds(double c){
        Scanner years = new Scanner(System.in);
        System.out.print("Enter a certain number of years: ");
        c = years.nextInt();
        double sec = c * (3.154e+7);
        return sec;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in

    //need to finish varargs method
    public void varargsMethod(String...v){
        for(String word : v){
            System.out.println(word);
        }
    }


}
