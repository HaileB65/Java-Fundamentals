package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Scanner;

class my_number{ // meant to be toward beginning of program. part of pass by reference example

    public int number;
    public my_number()
    {
        number = 1;
    }

}

public class MethodTraining {

    public static void main(String[] args) {
        int a = 30;
        int b = 5;
        int c = multiply(a, b);
        double d = 10.5;
        double e = multiply(a, b, d);

        int f = divide(a, b);

        double g = largestNumber(a, b, c, d);

        System.out.println("a x b = " + c);
        System.out.println("a x b x f = " + e);
        System.out.println("a / b = " + f);

        my_number obj = new my_number(); // creating an object for pass by reference example
        System.out.println("Orginal object value = " + obj.number); // printing original object value
        update(obj); // updating object
        System.out.println("Object value after update = " + obj.number); // // printing object value after update

        System.out.println("The largest number is equal to " + g);

        String str1 = "Hello";
        int consonants = numberOfConsonantsInString(str1);
        System.out.println("Number of vowels in string = " + consonants);

        int number = 0;
        primeNumber(number); // calling prime number method. passing variable e into method

//        int maxNum = 18;
//        int divisor1 = 6;
//        int divisor2 = 9;
//        populatingArrayList(maxNum, divisor1, divisor2); // calling populatingArrayList method


    }


    // 1) demonstrating how to overload a method
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(int a, int b, double d) {
        return a * b * d;
    }

    // 2) pass by value
    public static int divide(int a, int b) {
        return a / b;
    }


    // 3) pass by reference
    public static void update(my_number obj) {
        obj.number++;
    }

    // 4) return the largest of 4 numbers method
    public static double largestNumber(int a, int b, int c, double d) {
        if (a > b && b > c && c > d) {
            return a;
        } else if (b > a && a > c && c > d) {
            return b;
        } else if (c > a && a > b && c > d) {
            return c;
        } else
            return d;
    }

    // 5) Write a method to count all consonants (the opposite of vowels) in a String
    public static int numberOfConsonantsInString(String str1){
        int count = str1.length();
        for(int i=0; i < str1.length(); i++)
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
                count--;
            }
        return count;
    }

    // 6) Write a method that will determine whether or not a number is prime.
    // need help to make method cycle through list of prime numbers until either number
    // is found not to be prime or given number is reached on the primeNumberList list
    public static void primeNumber(int number) { // complete method that determines if a number is prime or not
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + "Enter a number between 1 and 67: ");
        number = scanner.nextInt();

        int[] primeNumberList = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67}; // array called primeNumberList

        for (int z = 0 ; z > 0 ; z++){
            System.out.println(primeNumberList[z]);
        }

        for (int i = number; i <= number; i++) {
            if (number % 2 == 0) { // if else loop that prints out if the number is a whole number or not
                System.out.println(number + " is not a prime number even number");
            } else if (number % 2 != 0) {
                System.out.println(number + " is a prime number");
            }
        }

//        for (int i = 0; i == primeNumberList.length; i++) {
//            if (number % primeNumberList[i] == 0) { // if else loop that prints out if the number is a whole number or not
//                System.out.println(number + " is not a prime number even number");
//            } else {
//                System.out.println(number + " is a prime number");
//            }
//        }
    }


//    7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//    In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//    divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//    length of the returned list

//      Finish method number 7

//    public static int populatingArrayList(int maxNum, int divisor1, int divisor2){
//
//        ArrayList<String> range = new ArrayList<String>();
//
//        for (int i = 0; i == 18; i++){
//
//        }
//
//        return range;
//    }



}


