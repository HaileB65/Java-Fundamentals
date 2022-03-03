package labs_examples.exception_handling.labs;


/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */


public class Exercise_01 {
    public static void main(String[] args) {
        Bird hawk = new Bird();
        hawk.printOutBirdList();
    }

    static class Bird{
        String[] birds = {"Hawk", "Blue Jay", "Raven", "Oriole"};

        public void printOutBirdList(){
            try {
                System.out.println(birds[10]);
            } catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("Error. Must print out index within list length.");
            }
        }
    }
}