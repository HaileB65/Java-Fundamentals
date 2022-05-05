package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

class Exercise_01{

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList(); // 1)
        list.add("Hello");  // 2)
        list.add("Hi");
        list.add("Hey");
        list.add("Yello!");

        System.out.println("LinkedList contains: " + list);


        Collection<String> collect = new ArrayList<>();
        collect.add("A");
        collect.add("Computer");
        collect.add("Portal");
        collect.add("for");
        collect.add("Science");

        list.addAll(collect); // 3)

        list.addFirst("no"); // 4)
        list.addLast("Thirteen"); // 5)
        System.out.println("First element in linked list: "+ list.getFirst()); // 6)
        System.out.println("Last element in linked list: "+ list.getLast()); // 7)
        System.out.println("Element from index 4 = "+ list.get(4)); // 8)
        list.set(2, "beienvenidos"); // 9)
        list.push( "Buenas Noches"); // 10) same as list.addFist();
        list.pop(); // 11) same as list.removeFirst();
        list.remove(); // removes head node of list

        System.out.print("Does list conatain 'Si'?: ");
        System.out.println(list.contains("Si"));



        System.out.println("List iterator = " + list.iterator());
        ListIterator<String>
                iterator = list.listIterator();

        // Printing the iterated value
        System.out.println("\nUsing ListIterator:\n");
        while (iterator.hasNext()) {
            System.out.println("Value is : "
                    + iterator.next());
        }

        list.clear();
        System.out.println("LinkedList contains: " + list);
    }
}
