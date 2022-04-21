package labs_examples.lambdas.labs.exercise_04;

import javafx.beans.binding.BooleanExpression;
import javafx.beans.binding.StringExpression;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
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
        System.out.println("1) ");
        IntStream
                .range(1, 16)
                .forEach(i -> System.out.print(i + " ")); // 1)
        System.out.println();
        System.out.println();

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 33,45);  // 2)
        Integer sum = integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("2) The sum is: " + sum);
        System.out.println();

        System.out.println("3) changing values from a stream ");  // 3)
        IntStream
                .range(1, 16)
                .map(i -> i +5)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println();
//        Integer sum3 = list.stream()
//                .map(i -> i + 5)
//                .forEach(i -> System.out.print(i + " "));
//        System.out.println("3) =" + sum3);


        IntStream intStream = IntStream.of(15, 13, 45, 18, 89, 70, 76, 56); // 4)
        OptionalDouble res = intStream
                .filter(num -> num > 68)
                .average();
        System.out.print("4) Average of the elements of the stream is ");
        if (res.isPresent()) {
            System.out.print(res.getAsDouble());
        } else {
            System.out.print("Nothing!");
        }
        System.out.println();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6); // 5)
        Integer result = numbers
                .stream()
                .reduce(0, (element1, element2) -> element1 + element2);
        System.out.println("5) result =  " + result);


        String fileName = "src/labs_examples/lambdas/labs/exercise_04/line.txt"; // 6)
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            System.out.println("6) reading txt file and printing results:");

            stream
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end of file");
        System.out.println();

        String fileName2 = "src/labs_examples/lambdas/labs/exercise_04/stream_text_lab.csv"; // 7)
        try (Stream<String> stream = Files.lines(Paths.get(fileName2))) {
            System.out.println("7) ");

            stream
//                    .peek(s -> System.out.println("string: " + s))
                    .map(s -> s.split(","))
//                    .peek(arr -> System.out.println("arr : "+ Arrays.toString(arr)))
                    .map(arr -> arr[1])
//                    .peek(s -> System.out.println("string: " + s))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end of file");
        System.out.println();
//        try (Stream<String> stream = Files.lines(Paths.get(fileName2))) {
//            System.out.println("7) reading csv file and printing results:");
//
//            stream
//                    .forEach(System.out::println);
//            System.out.println();
//            File file = new File(fileName2);
//            Scanner input = new Scanner(file);
//            List<String> list5 = new ArrayList<String>();
//            while (input.hasNextLine()) {
//                list5.add(input.nextLine());
//
//            }
//            System.out.println(list5); // wasn't able to figure out how to make each element an individual string
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("end of file");
//        System.out.println();


        try (Stream<String> stream = Files.lines(Paths.get(fileName2))) {  // 8)
            System.out.println("8) reading txt file and printing results:");

            File file = new File(fileName2);
            Scanner input = new Scanner(file);
            List<String> list5 = new ArrayList<String>();
            while (input.hasNextLine()) {
                list5.add(input.nextLine());

            }
            System.out.println(list5); // wasn't able to figure out how to make each element an individual string

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end of file");
        System.out.println();


        List<Integer> list4 = Arrays.asList(3, 4, 6, 12, 20); // 9)
        boolean answer = list4.stream().anyMatch(n
                -> (n * (n + 1)) / 4 == 5);
        System.out.println("9) demonstrating use of anyMatch() function: " + answer);
        System.out.println();

        System.out.println("10) demonstrating use of allMatch() function: "); // 10)
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
        boolean answer2 = list.stream().allMatch(n-> n % 3 ==0);
        System.out.println(answer2);

    }

    private static <T> List<T> streamToList (Stream<T> stream)
    {
        return stream
                .filter(Objects::nonNull)    // optionally apply any filter
                .collect(Collectors.toList());
    }
}