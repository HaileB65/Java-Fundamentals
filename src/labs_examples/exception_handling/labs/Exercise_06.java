package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Exercise_06 {

    public static void main(String[] args) {
        secondMethod();

    }

    static public void divide() throws ArithmeticException{
        int a = 88/0;
    }

    static public void secondMethod(){
        try {
            divide();
        }catch(ArithmeticException exc){
            System.out.println("Can not divide by zero");
        }
    }

}