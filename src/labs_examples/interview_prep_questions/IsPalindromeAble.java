package labs_examples.interview_prep_questions;

import java.util.Arrays;

public class IsPalindromeAble {
    private static boolean isPalindromeAble(String str) {

        if (str.length() == 0){
            System.out.print("String is empty  ");
        }
        if (str.length() == 1){
            System.out.print("There is only one letter in string  ");
        }

        // Implement your solution here
        // Converting input string to character array
        char tempArray[] = str.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        //  new sorted string
//        String str2 = new String(tempArray);

//        System.out.println(str2);

//        if(all letter as double){
//            // is palindromeable
//        }

        for (int i = 0; i < tempArray.length; i+=2) {
            if (tempArray[i] == tempArray[i + 1]) {
//                tempArray[0] == tempArray[1];
//                tempArray[2] == tempArray[3];
//                tempArray[4] == tempArray[5];
                continue;
            } else{
                return false;
            }
        }
//        if(not all letters have a double){
//            // not palindromeable
//        }
        return true;
    }

    public static void main(String[] args) {
        // Positive cases
        test("", true);
        test("a", true);
        test("aa", true);
        test("aba", true);
        test("abba", true);

        test("abab", true);
        test("abfab", true);
        test("aabbccddf", true);
        test("aabbccddff", true);

        // Negative cases
        test("abcd", false);
        test("aba ", false);

        test("aabbcd", false);
        test("abcd", false);
    }

    private static void test(String str, boolean expected) {
        try {
            boolean actual = isPalindromeAble(str);
            System.out.printf("Test: '%s' expected: %s actual: %s ", str, expected, actual);
            if (actual == expected) {
                System.out.println(" - pass");
            } else {
                System.out.println(" - fail");
            }
        } catch (Exception e) {
            System.out.printf("Test: '%s' expected: %s actual: %s - fail with exception\n", str, expected, e.getLocalizedMessage());
        }
    }
}
