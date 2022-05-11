package labs_examples.datastructures.stack.labs.exercise_02;

import java.lang.reflect.Array;
import

public class GenericStackClass<E> {

    E[] data = (E[]) new Object[10];

    public GenericStackClass(Class<E> clazz, int capacity) {  // constructor of generic array
        data = (E[]) Array.newInstance(clazz, capacity);
    }

    /**
     * Adds an item to the stack
     *
     * @param item to be added
     */
    public void push(E item) {
        // insert item into front of list
        data[0] = item;
    }


    /**
     * Removes an item from the stack
     *
     * @return the removed item
     */
    public E pop() {
        try {
            int[] copy = new int[array.length - 1];

            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    copy[j++] = array[i];
                }
            }

            // get first item
            E item = list.get(0);
            // remove first item
            list.remove(0);
            data = ArrayUtils.remove(data, 0);
            // return first item
            return item;
        } catch (NullPointerException ex) {
            System.out.println("Exception: list is empty" + ex);
            return null;
        }
    }


    /**
     * Determines if the stack is empty
     *
     * @return true if empty, false if not empty
     */
    public boolean empty() {
        return list.isEmpty();
    }

    public void printOutStack(){
        for(int i = 0; i < firstArray.length; i++){
            System.out.println(firstArray[i]);
        }
    }

    public void resizeArray{
        //when array is 3/4 full resize stack to be two times as long

    }
}
