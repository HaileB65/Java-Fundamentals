package labs_examples.lambdas.labs;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class Exercise_02{
    public static void main(String[] args) {
        Predicate<String> trueOrFalse = (p) -> {
            if(p == p) {
                return true;
            }
            return false;
        };
        System.out.println("Using Predicate interface:" + trueOrFalse.test("hello"));

        BinaryOperator<Integer> xPlusYSqred = (x, y) -> x + (y*2);
        System.out.println("Using BinaryOperator interface:" + xPlusYSqred.apply(5,25));

        Function<Integer,Integer> xSqred = (x) -> x*x;
        System.out.println("Using Function interface:" + xSqred.apply(12));

        BiFunction<Integer,Integer,Boolean> isItEqualTo = (w, r) -> {
            if(w == r) {
                return true;
            }
            return false;
        };
        System.out.println("Using BiFunction interface:" + isItEqualTo.apply(12,88));

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Using Supplier interface:" + randomValue.get());

        Consumer<String> display = a -> System.out.println(a);
        display.accept("Using Supplier interface: " + " Hello World!");

    }
}
