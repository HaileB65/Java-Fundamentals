package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CompareMinSpeedTest {

    public static void main(String[] args) {
        System.out.println("Warming up JVM");
        run(1000);
        System.out.println();
        System.out.println();
        System.out.println("Measurement runs");
        run(1);
        run(1);
        run(10);
        run(10);
        run(100);
        run(100);
        run(1_000);
        run(1_000);
//        run(1_000_000);
//        run(1_000_000);
//        run(1_000_000_000);
//        run(1_000_000_000);
//        run(2_000_000_000);
//        run(2_000_000_000);
    }

    private static void run(int size) {
        System.out.printf("Run min() with sample size: %,d\n", size);

        // Setup inputs
        int[] randomInts = new Random().ints(size, -1_000_000_000, 1_000_000_000).toArray();

        timeAndPrint("for loop", () -> {
            int min = randomInts[0];
            for (int i = 0; i < randomInts.length; i++) {
                if (randomInts[i] < min) {
                    min = randomInts[i];
                }
            }
            return min;
        });

        timeAndPrint("enhanced loop", () -> {
            int min = randomInts[0];
            for (int randomInt : randomInts) {
                if (randomInt < min) {
                    min = randomInt;
                }
            }
            return min;
        });

        IntStream intStream = Arrays.stream(randomInts);
        timeAndPrint("sequential IntStream",
                () -> intStream.sequential().min().getAsInt());

        IntStream intParallelStream = Arrays.stream(randomInts);
        timeAndPrint("parallel IntStream",
              () -> intParallelStream.parallel().min().getAsInt());

        IntStream intStreamSummaryStatistics = Arrays.stream(randomInts);
        timeAndPrint("summaryStatistics sequential IntStream",
                () -> intStreamSummaryStatistics.summaryStatistics().getMin());

        IntStream intParallelStreamSummaryStatistics = Arrays.stream(randomInts);
        timeAndPrint("summaryStatistics parallel IntStream",
                () -> intParallelStreamSummaryStatistics.parallel().summaryStatistics().getMin());

        System.out.println();
    }

    private static void timeAndPrint(String name, Supplier<Integer> code) {
        Integer min;

        long startTime = System.nanoTime();
        min = code.get();
        long stopTime = System.nanoTime();

        System.out.printf("%40s: %,15d ", name, stopTime - startTime);
        System.out.printf("result %d\n", min);
    }
}

