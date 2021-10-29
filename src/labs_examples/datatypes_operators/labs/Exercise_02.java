package labs_examples.datatypes_operators.labs;

import java.sql.SQLOutput;

/**
 * Data Types and Operators Exercise 2: Type conversion and casting
 *
 *      Write the necessary code to demonstrate type conversion:
 *
 *      Widening:
 *      1. Declare and initialize an int with the value 10
 *      2. Declare a double and set it equal to the int
 *      3. Print out the double
 *
 *      Narrowing (with casting):
 *      1. Declare and initialize a new double with the value 10.5
 *      2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
 *      3. Print out the int
 *
 *      Notice how each type is converted. In which direction is information lost?
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // write code here
        int x = 1001;
        System.out.println("int x = " + x);
        double d = x;
        System.out.println("double d = " + d);


        double n = 10.5;
        System.out.println("double n = " + n);
        int z = (int) n;
        System.out.println("int z = " + z); // information can be lost during a narrowing conversion
    }
}
