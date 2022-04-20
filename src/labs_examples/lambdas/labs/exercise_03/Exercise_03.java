package labs_examples.lambdas.labs.exercise_03;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

class Exercise_03 {
    public static void main(String[] args) {

        Comparator<Integer> xPlusYSquared = (x,y) -> {
            if (x < y) return -1;
            if (y > x) return 1;
            return 0;
        };
        System.out.println("static method reference: " + xPlusYSquared.compare(5,8));

        Exercise_03 myApp = new Exercise_03();
        System.out.println("instance method reference: " + Exercise_03
                .mergeThings("Hello ", "World!", myApp::appendStrings2));

        Supplier<Object> create = () -> new MathFunctions();
        System.out.println("reference to a constructor: " + create.get());


    }

    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }

    public String appendStrings2(String a, String b) {
        return a + b;
    }
}
