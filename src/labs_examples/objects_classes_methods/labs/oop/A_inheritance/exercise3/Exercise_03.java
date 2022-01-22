package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise3;

/**
 * Why does the output print in the order it does?
 *
 * You answer: A object of class "C" has been created. Class "C" extends class "B" which extends class "A". Therefore,
 * any object created from class "C" will inherit/print out the behavior and methods from both class "A" and "B".
 * Methods inherited from class "A" and "B" will print out before printing out any methods from class "C".
 *
 */

class A_1 {
    public A_1()
    {
        System.out.println("Class A Constructor");
    }
}

class B_1 extends A_1 {
    public B_1()
    {
        System.out.println("Class B Constructor");
    }
}

class C_1 extends B_1 {
    public C_1()
    {
        System.out.println("Class C Constructor");
    }
}

public class Exercise_03 {
    public static void main(String[] args)
    {
        C_1 c = new C_1();
    }
}
