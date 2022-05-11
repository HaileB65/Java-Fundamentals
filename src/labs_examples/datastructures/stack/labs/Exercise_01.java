package labs_examples.datastructures.stack.labs;


import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack();

        myStack.push("Hello");
        myStack.push("World");
        myStack.push("Programming");
        myStack.push("is so");
        myStack.push("COOL");

        System.out.println("Size of the Stack after pushing: " + myStack.size() + "\n");

        System.out.println("Peek: " + myStack.peek() + "\n");

        System.out.println(myStack.pop());

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println("\nSize of the Stack after popping: " + myStack.size());


    }
}