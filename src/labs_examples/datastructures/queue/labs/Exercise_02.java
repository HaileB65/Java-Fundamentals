package labs_examples.datastructures.queue.labs;

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
        GenericQueueClass queue = new GenericQueueClass<>();

        queue.push("hello");
        queue.push("HI");
        queue.push("Hey!");
        System.out.println("array size = " + queue.arraySize());
        System.out.println();
        queue.printOutStack();
        System.out.println();

        System.out.println("value at top of queue: " + queue.peekFirst());
        System.out.println("value at top of queue: " + queue.peekLast());
    }

    static class GenericQueueClass<E> {
        E[] element;
        int index = 0;
        int arrayLength = 10;
        E temp;


        public GenericQueueClass() {
            element = (E[]) new Object[arrayLength];

        }

        public void push(E newData) {

            element[(element.length-1)- (element.length-1)] = newData; // places elements into array in reverse
            index--;

//            data[index] = newData;  // places elements into array in order
//            index++;

        }

        public E pop(E[] list) throws CustomException {
            try {

                if(list.length < 0){
                    throw new CustomException("current Queue is empty");
                }
                E item = element[0];
                E[] copy = (E[]) new Object[element.length-1];

                for (int i = 0, j = 0; i < element.length; i++) {
                    if (i != 0) {
                        copy[j++] = (E) element[i];
                    }
                }
                return item;

            } catch (CustomException ex) {
                System.out.println("Exception: list is empty" + ex);
                return null;
            }
        }

        public int empty() {
            return element.length;
        }

        public void printOutStack(){
            for(int i = 0; i < element.length; i++){
                System.out.println(element[i]);
            }
        }


        public void resizeArray(){
            if (element.length < (arrayLength / .75) ){
                element = (E[]) new Object[arrayLength*2];
            }
            if (element.length < (arrayLength / .25) ){
                element = (E[]) new Object[arrayLength/2];
            }
        }

        public E peekFirst(){
            return element[0];

        }

        public E peekLast(){
            return element[element.length-1];
        }

        static class CustomException extends Exception{

            public CustomException(String custom_exception) {

            }

            @Override
            public String toString(){
                return "Custom Exception";
            }
        }

        public int arraySize(){
            return element.length;
        }


    }
}
