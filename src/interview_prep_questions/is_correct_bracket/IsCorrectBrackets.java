package interview_prep_questions.is_correct_bracket;

public class IsCorrectBrackets {

    private static boolean isCorrectBrackets(String str) {

        // Implement your solution here

        // Don't forget to remove the Exception
        throw new RuntimeException("Not implemented");
    }

    public static void main(String[] args) {
        // Positive cases
        test("", true);
        test("abcd efhg", true);
        test("()", true);
        test("(())", true);
        test("{}", true);
        test("{{}}", true);
        test("[]", true);
        test("[[]]", true);
        test("({[]})", true);
        test("(({{[[]]}}))", true);

        test("[\\]", true);
        test("[|]", true);

        test("a(bc)d", true);
        test("(b[cd]e)", true);
        test("x(a[b{d}c]d)", true);
        test("x (a[ b{ }c ]d)", true);

        // Negative cases
        test("(", false);
        test(")", false);
        test("{", false);
        test("}", false);
        test("[", false);
        test("]", false);
        test("(]", false);
        test("({)", false);
        test("{[}]", false);
        test("({[]}", false);
        test("{[]})", false);

        test("a(b]c", false);
        test("a({)d", false);
        test("{[ }]", false);
        test(" { [ } ] ", false);

        // Special cases
        test(null, false);
    }

    // Add colors to the tests output
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private static void test(String str, boolean expected) {
        try {
            boolean actual = isCorrectBrackets(str);
            System.out.printf("Test: '%s' expected: %s actual: %s ", str, expected, actual);
            if (actual == expected) {
                System.out.println(ANSI_GREEN + " - pass" + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + " - fail" + ANSI_RESET);
            }
        } catch (Exception e) {
            System.out.printf("Test: '%s' expected: %s actual: %s " + ANSI_RED + "- fail with exception" + ANSI_RESET + "\n", str, expected, e);
        }
    }
}
