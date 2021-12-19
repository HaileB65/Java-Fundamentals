package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {

    public static void main(String[] args){
        int a = 5;
        int b = 6;
        int c = multiply(a,b);
        double d = 10.5;
        double e = multiply(a,b,d);

        System.out.println("a x b = " + c);
        System.out.println("a x b x f = " + e);
    }

    //demonstrating how to overload a method
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double multiply(int a, int b, double d){
        return a * b * d;
    }
}
