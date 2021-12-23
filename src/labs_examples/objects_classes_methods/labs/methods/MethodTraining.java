package labs_examples.objects_classes_methods.labs.methods;

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
    // To prove whether a number is a prime number, first try dividing it by 2, and see if you get a whole number.
    // If you do, it can't be a prime number. If you don't get a whole number, next try dividing it by
    // prime numbers: 3, 5, 7, 11 (9 is divisible by 3) and so on, always dividing by a prime number (see table below).
    public static void primeNumber(int number) { // complete method that determines if a number is prime or not

        for (int i = 0; i <= 2; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\n" + "Enter a number ");
            number = scanner.nextInt();

            int[] primeNumberList = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67}; // array called primeNumberList

//            for (int element : primeNumberList) {
//                if (number % element == 0) { // if loop that prints out if the number is even or odd
//                    System.out.println(number + " is not a prime number even number");
//                } else if (number % 3 == 0) {
//                    System.out.println(number + " is a prime number?");
//                }
//            }
        }
    }


}


