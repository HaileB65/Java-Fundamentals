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

        //STRING CLASS METHODS
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
        System.out.println(str8.replace('l', 'p')); // letter l is replaced with the letter p

        //replaceFirst() Method
        String str9 = "Java says hello world. Java String tutorial";
        String newStr = str9.replaceFirst("Java", "JAVA"); // first Java is replaced with Java
        String regexResult = str9.replaceFirst("[a]", "A"); // then java is replaced with JAva
        System.out.println(newStr);
        System.out.println(regexResult);

        //replaceAll() Method
        String str10="javatpoint is a very good website";
        String replaceString=str10.replaceAll("a","e");//replaces all occurrences of "a" to "e"
        System.out.println(replaceString);

        //split() Method
        String Str11 = new String("Welcome-to-Tutorialspoint.com");
        System.out.println("Return Value :" );

        for (String retval: Str11.split("-")) {
            System.out.println(retval); // separates "welcome", "to", and "Tutorialspoint.com" on to different lines
        }

        //substring() Method
        String str12= new String("quick brown fox jumps over the lazy dog");
        System.out.println("Substring starting from index 15:");
        System.out.println(str12.substring(15)); // shows substring starting from letter 15 in the sentence
        System.out.println("Substring starting from index 15 and ending at 20:");
        System.out.println(str12.substring(15, 20)); // shows substring starting from letter 15 to letter 20 in the sentence

        //toUpperCase() and toLowerCase() Methods
        String str13 = "Good morning!";
        String str14 = "It's a beautiful day.";

        System.out.println("All uppercase: " + str13.toUpperCase()); // changes all letters in the sentence to uppercase
        System.out.println("All lowercase: " + str14.toLowerCase()); // changes all letters in the sentence to lowercase

        //toString() Method
        Integer number=10;
        System.out.println( number.toString() ); // Calling the toString() method as a function of the Integer variable

        //trim method
        String str15 = " geeks for geeks has all java functions to read  ";
        System.out.println(str15.trim()); // trims the trailing and leading spaces

        //valueOf() Method
        Integer x =Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");
        Integer b = Integer.valueOf("444",16);

        System.out.println(x);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);



    }


}