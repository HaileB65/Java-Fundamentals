package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        try {
            divide();
        }catch(ArithmeticException exc){
            System.out.println("Can not divide by zero");
        }

    }

    static public void divide() throws ArithmeticException{
        int a = 88/0;
    }

}