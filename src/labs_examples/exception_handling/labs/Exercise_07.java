package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class Exercise_07 {

    public static void main(String[] args) {
        try {
            divide();
        }catch(CustomException exc){
            System.out.println("enter a higher number");
        }
    }

    static public int divide() throws CustomException{
        int a = 88/2;
        if(a >0){
            throw new CustomException("Custom exception: room is full");
        }
        return a;
    }


    static class CustomException extends Exception{

        public CustomException(String custom_exception) {

        }

        @Override
        public String toString(){
            return "Custom Exception";
        }
    }

}