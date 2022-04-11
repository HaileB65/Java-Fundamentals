package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demontsrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      
 */

class Exercise_04 {
    public static void main(String[] args) {
        IntStream.range(1, 16).forEach(i -> System.out.print(i + " ")); // 1)
        System.out.println();

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 33,45);  // 2)
        Integer sum = integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("2) The sum is: " + sum);
        System.out.println();

        List<Integer> list = Arrays.asList(3, 100, 9, 12, 15);  // 3)
        Integer sum3 = list.stream()
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println("3) =" + sum3);
        System.out.println();


        IntStream intStream = IntStream.of(15, 13, 45, 18, 89, 70, 76, 56); // 4)
        OptionalDouble res = intStream.average();
        System.out.println("Average of the elements of the stream...");
        if (res.isPresent()) {
            System.out.println(res.getAsDouble());
        } else {
            System.out.println("Nothing!");
        }


        integers.stream()
                .filter(num -> num >  10)
                .forEach(System.out::println);

//        list.stream()
//                .map(number -> number * 3)
//                .forEach(System.out::println);
//        System.out.println();
//
//        Integer[] nums = {45, -87, -12, 77, -23};
//        Stream<Integer> stream = Arrays.stream(nums);
//        int sum2 = stream
//                .filter(x -> x > 0)   //lambda expression to filter out values < 1
//                .reduce(0, (Integer a, Integer b) -> a + b);  //reduce remaining nums into sum
//        System.out.println("The sum is: " + sum2);
    }

    
}