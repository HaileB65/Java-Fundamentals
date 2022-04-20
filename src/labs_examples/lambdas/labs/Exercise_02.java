package labs_examples.lambdas.labs;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.BiPredicate;
import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;


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
            if(p == p) { // string value isn't being compared here. Something else is being compared here maybe String length?
                return true;
            }
            return false;
        };
        System.out.println("#1 Using Predicate interface: " + trueOrFalse.test("hello"));

        BinaryOperator<Integer> xPlusYSqred = (x, y) -> x + (y*2);
        System.out.println("#2 Using BinaryOperator interface: " + xPlusYSqred.apply(5,25));

        Function<Integer,Integer> xSqred = (x) -> x*x;
        System.out.println("#3 Using Function interface: " + xSqred.apply(12));

        BiFunction<Integer,Integer,Boolean> isItEqualTo = (w, r) -> {
            if(w == r) {
                return true;
            }
            return false;
        };
        System.out.println("#4 Using BiFunction interface: " + isItEqualTo.apply(12,88));

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("#5 Using Supplier interface:" + randomValue.get());

        Consumer<String> display = a -> System.out.println(a);
        display.accept("#6 Using Supplier interface: " + " Hello World!");

        DoubleConsumer convertDouble = x -> { // #7
            int myInt = (int) x;
            System.out.println("#7 Using DoubleConsumer interface: " + myInt);
        };
        convertDouble.accept(58.79);

        BiPredicate<String, String> compareStrings = (p,t) -> {
            if(p == t) { // string value isn't being compared here. Something else is being compared here maybe String length?
                return true;
            }
            return false;
        };
        System.out.println("#8 Using Predicate interface: " + compareStrings.test("hello", "hello"));
        //System.out.println("#8 Using Predicate interface: " + compareStrings.test(new String("hello"), new String("hello")));
        //

        IntConsumer display2 = q -> System.out.println(q);
        System.out.print("#9 Using IntConsumer interface: ");
        display2.accept(26);

        IntUnaryOperator op = IntUnaryOperator.identity();
        System.out.println("#10 Using IntConsumer interface: " + op.applyAsInt(12));


    }
}
