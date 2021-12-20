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
        System.out.println("number = " + obj.number); // printing original object value
        update(obj); // updating object
        System.out.println("number = " + obj.number); // // printing object value after update

        System.out.println("g = " + g);

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
    public static double largestNumber(int a, int b, int c, double d) { // finish method and make sure largest number is printed
        if (a > b) {
            return a;
        } else if (b > c) {
            return b;
        } else if (c > d) {
            return c;
        } else
            return d;
    }
}

