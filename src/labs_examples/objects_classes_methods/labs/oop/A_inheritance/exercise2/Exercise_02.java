package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise2;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: 10 prints out b/c the integer "i" is called from class "A" where "i" = 10.
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}