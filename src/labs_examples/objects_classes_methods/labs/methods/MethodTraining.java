package labs_examples.objects_classes_methods.labs.methods;

class my_number{ // meant to be toward beginning of program. part of pass by reference example

    public int number;
    public my_number()
    {
        number = 1;
    }

}

public class MethodTraining {

    public static void main(String[] args) {
        int a = 30;
        int b = 5;
        int c = multiply(a, b);
        double d = 10.5;
        double e = multiply(a, b, d);

        int f = divide(a, b);

        double g = largestNumber(a, b, c, d);

        System.out.println("a x b = " + c);
        System.out.println("a x b x f = " + e);
        System.out.println("a / b = " + f);

        my_number obj = new my_number(); // creating an object for pass by reference example
        System.out.println("Orginal object value = " + obj.number); // printing original object value
        update(obj); // updating object
        System.out.println("Object value after update = " + obj.number); // // printing object value after update

        System.out.println("The largest number is equal to " + g);

        String str1 = "Hello";
        int consonants = numberOfConsonantsInString(str1);
        System.out.println("Number of vowels in string = " + consonants);

    }


    //demonstrating how to overload a method
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(int a, int b, double d) {
        return a * b * d;
    }

    // pass by value
    public static int divide(int a, int b) {
        return a / b;
    }


    // pass by reference
    public static void update(my_number obj) {
        obj.number++;
    }

    //return the largest of 4 numbers method
    public static double largestNumber(int a, int b, int c, double d) {
        if (a > b && b > c && c > d) {
            return a;
        } else if (b > a && a > c && c > d) {
            return b;
        } else if (c > a && a > b && c > d) {
            return c;
        } else
            return d;
    }

    //Write a method to count all consonants (the opposite of vowels) in a String
    public static int numberOfConsonantsInString(String str1){
        int count = str1.length();
        for(int i=0; i < str1.length(); i++)
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
                count--;
            }
        return count;
    }

    //Write a method that will determine whether or not a number is prime
public static int primeNumber(int e){
        

}

}

