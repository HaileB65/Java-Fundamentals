package labs_examples.interview_prep_questions;

public class IsPalindromeAble {
    private static boolean isPalindromeAble(String str) {

        // Implement your solution here

        // Don't forget to remove the Exception
        throw new RuntimeException("Not implemented");
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
