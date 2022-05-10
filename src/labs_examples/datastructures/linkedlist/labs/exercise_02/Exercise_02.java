package labs_examples.datastructures.linkedlist.labs.exercise_02;

/**
 * LinkedLists - Exercise_02
 * <p>
 * Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 * class we used here, it must be entirely unique. Please also add at least two
 * additional helper methods that you think could be useful. Refer to Java's built-in
 * LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 * to add and remove elements from the front of the list AND the end of the list.
 * Also, instead of using the index in the get() and remove() methods, these methods should
 * get() and remove() based by the Node's value, not it's index.
 */

class Exercise_02 {
    public static void main(String[] args) {
    CustomLinkedList firstLinkedList = new CustomLinkedList();

        firstLinkedList.addToFrontOfList("Me");
        firstLinkedList.addToFrontOfList("You");
        firstLinkedList.addToEndOfList("Us");
        firstLinkedList.addToEndOfList("Them");

        System.out.println(firstLinkedList.get(2));
        System.out.println();
        firstLinkedList.printOutList(firstLinkedList);

    }
}