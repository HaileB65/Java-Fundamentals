package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        int[] list = {15,48,68,0};
        int a;

        try{
            a = list[0] / list[5];
        }catch(ArrayIndexOutOfBoundsException exc2){
            System.out.println("Must select index within list length.");
            try{
                a = list[0] / list[3];
            } catch (ArithmeticException exc){
                System.out.println("Error. Can not divide by zero.");
            }
        }finally {
            System.out.println("Program complete");
        }


    }
}