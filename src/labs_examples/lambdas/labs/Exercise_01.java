package labs_examples.lambdas.labs;
import java.util.function.Predicate;
import java.util.function.BinaryOperator;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */

@FunctionalInterface
interface MyFunctionalInterface {  // 1) abstract method that takes no parameters and returns void
    void someMethod();
}

@FunctionalInterface
interface MyFunctionalInterface2 {  // 3) abstract method that takes 1 parameter and returns same data type
    double calculate(Integer x);
}

@FunctionalInterface
interface MyFunctionalInterface3 {  // 5) abstract method that takes 2 parameters and returns a value
    double process(Integer x, Integer y);
}

class FunctionInterfaceExercise {
    public static void main(String args[]) {

        MyFunctionalInterface addNumbers = () -> System.out.println("add numbers"); // 2) lambda expression
        MyFunctionalInterface subtractNumbers = new MyFunctionalInterface() {  // 2) anonymous inner class
            @Override
            public void someMethod() {
                System.out.println("subtract numbers");
            }
        };
        addNumbers.someMethod();
        subtractNumbers.someMethod();

        MyFunctionalInterface2 divideByTwo = (x) ->  (x/2); // 4) lambda expression
        MyFunctionalInterface2 divideByThree = new MyFunctionalInterface2() {  // 4) anonymous inner class
            @Override
            public double calculate(Integer x) {
                return x/4;
            }
        };
        System.out.println(divideByTwo.calculate(10));
        System.out.println(divideByThree.calculate(99));

        MyFunctionalInterface3 addTwoParameters = (x, y) -> x + y;  // 6) lambda expression
        MyFunctionalInterface3 divideTwoParameters = new MyFunctionalInterface3() {  // 6) anonymous inner class
            @Override
            public double process(Integer x, Integer y) {
                return x / y;
            }
        };
        System.out.println(addTwoParameters.process(10,90));
        System.out.println(divideTwoParameters.process(80,45));

        Predicate<String> z = (s) -> {  // 7) using built-in functional interfaces
            if(s == s) {
                return true;
            }
            return false;
        };

        System.out.println(z.test("hello"));

        BinaryOperator<Integer> xPlusYSqred = (x, y) -> x + (y*2);  // 7) using built-in functional interfaces
        System.out.println(xPlusYSqred.apply(5,25));





    }
}