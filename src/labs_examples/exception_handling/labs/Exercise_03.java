package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        int[] list = {15,48,68,0};
        int a;

        try{
            a = list[0] / list[5];
            a = list[0] / list[3];

        }catch(ArrayIndexOutOfBoundsException exc2){
            System.out.println("Must select index within list length.");
        }finally {
            System.out.println("Program complete");
        }


    }
}