package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int blue = str.length();
        System.out.println("The length of the blue is " + blue);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean equalStrings = str.equalsIgnoreCase(str2);
        System.out.println("Do str & str2 match? " + equalStrings);

        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;
        System.out.println("str + str2= " + str3);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        //copyValueOf() Method
        char[] str4 = {'H', 'e', 'l', 'l', 'o'};
        String str5 = "";
        str5 = str5.copyValueOf(str4, 0, 5);
        System.out.println("Returned String: " + str5);

        //format() Method
        String str6 = new String("Welcome to JavaTpoint").intern(); // statement - 1
        String str7 = new String("Welcome to JavaTpoint").intern(); // statement - 2
        System.out.println(str7 == str6); // prints true b/c content of str and str1 are the same and no new string object was created for str7

        //replace() Method
        String str8 = "Hello";
        System.out.println(str8.replace('l', 'p'));

        //replaceFirst() Method
        String str9 = "Java says hello world. Java String tutorial";
        String newStr = str9.replaceFirst("Java", "JAVA");
        String regexResult = str9.replaceFirst("[a]", "A");
        System.out.println(newStr);
        System.out.println(regexResult);

    }


}