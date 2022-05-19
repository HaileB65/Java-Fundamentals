package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

class exercise_01{
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();

        queue.add("This");
        queue.add("is");
        queue.add("A");
        queue.add("list");
        System.out.println(queue);
        System.out.println(queue.size());

        queue.remove();
        System.out.println(queue);
        System.out.println(queue.contains("is"));
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        queue.clear();

        System.out.println(queue);


    }
}
