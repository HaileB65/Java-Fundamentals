package labs_examples.datastructures.linkedlist.labs.exercise_02;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomLinkedList<T> {
    private Node head;


    @SafeVarargs
    public CustomLinkedList(T... data) {
            head = null;
    }

    public void addToFrontOfList(T newData){
        Node new_node = new Node(newData); // pushes new data to front of  the list
        new_node.next = head;
        head = new_node;
    }

    public void addToEndOfList(T newData){
        Node iterator = head; // reference to head node

        Node previous = null; // track previous node

            // so we need to iterate all the way through list to find last node
            // we'll know we've hit the last node when "iterator.next" is equal to null
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            // once we exit the loop above, iterator will be referencing the final node in the list
            // at this point we can attach the new Node to the "next" variable of the final node in th list
            iterator.next = new Node(newData);
    }

    public void remove(T data) {
        Node temp = head; // reference to head node

        Node prev = null; // reference to previous node

        if (temp != null && temp.data == data) {  // change the head node if headNode holds the key value
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != data) { // find node with key value
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) { // if key was not present in list
            return;
        }

        prev.next = temp.next;

        }

    public T get(int index) {
        try {
            // simple variable to use for looping over the list
            int count = 0;


            // creating a new variable that initially references the "head" node
            // we'll use this new variable to traverse across the list
            Node iterator = head;


            // iterate until index is reach
            while (count != index) {
                iterator = iterator.next;
                count++;
            }
            return (T) iterator.data;


        } catch (NullPointerException ex) {
            return null; // list is empty
        }
    }

    public void set(int index, T data) {
        try {
            int count = 0;
            Node iterator = head;


            // iterate through list
            while (count != index) {
                iterator = iterator.next;
                count++;
            }


            // change data
            iterator.data = data;


        } catch (NullPointerException ex) {
            System.out.println("invalid index");
        }
    }

    public int size() {
        int count = 0;
        Node iterator = head;


        // iterate through list
        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }


        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
