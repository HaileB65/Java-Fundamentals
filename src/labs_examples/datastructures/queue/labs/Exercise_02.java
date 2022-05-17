package labs_examples.datastructures.queue.labs;

import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;

/**
 *      Queues - Exercise_02
 *
 *      Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Queue class must also do the following:
 *
 *      1) throw a custom exception when trying to pop  an element from an empty Queue
 *      2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Queue
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue<>();

        queue.enqueue(125);
        queue.enqueue(358);
        queue.enqueue(786);
    }

     static class CustomQueue<V> {


        // create a LinkedList for us to use as the underlying data structure
        private CustomLinkedList<V> list = new CustomLinkedList<>();


        // simple boolean to track whether or not the queue is empty
        private boolean isEmpty;


        // constructor - set empty to true upon creation
        public CustomQueue() {
            isEmpty = true;
        }


        /**
         * Adds an item to the Queue
         * @param item to be added
         */
        public void enqueue(V item) {
            // insert item into front of list
            list.add(item);
            isEmpty = false;
        }


        /**
         * Removes an item from the Queue
         * @return the removed item
         */
        public V dequeue() {
            try {
                // get item from the front of the Queue
                V item = list.get(0);


                // remove that item from the front of the Queue            list.remove(0);



                // check if empty
                if (list.get(0) == null) {
                    isEmpty = true;
                }


                // return first item that we got just above
                return item;
            } catch (NullPointerException ex) {
                return null;
            }
        }


        public boolean isEmpty() {
            return isEmpty;
        }
    }
}
