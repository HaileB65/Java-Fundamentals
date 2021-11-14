package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] ars){
        int i = 5;
        System.out.println("i = " +i);
        while(i<=12){
            i++;
            if(i==9){
                continue;
            }
            System.out.println("i = " +i);
        }
    }
}
