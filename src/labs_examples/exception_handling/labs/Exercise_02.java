package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */




public class Exercise_02 {
    public static void main(String[] args) {
        int[] list = {15,48,68,0};
        int a;

        try{
            a = list[0] / list[5];
            a = list[0] / list[3];

        }catch(ArrayIndexOutOfBoundsException exc2){
            System.out.println("Must select index within list length.");
        }catch(ArithmeticException exc){
            System.out.println("Error. Can not divide by zero.");
        }

    }
}