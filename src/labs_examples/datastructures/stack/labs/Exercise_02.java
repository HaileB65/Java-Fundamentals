package labs_examples.datastructures.stack.labs;

/**
 *      Stacks - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following: (Ryan Take 2)
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack
 *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
 *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Stack
 *
 *      TIP: To initialize an new array of a Generic type you can use this:
 *           T[] data = (T[]) new Object[10];
 */

public class Exercise_02{

    public static void main(String[] args) {
        GenericQueueClass stack = new GenericQueueClass();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("array size = " + stack.arraySize());
        System.out.println();
        stack.printOutStack();
        System.out.println();

        System.out.println("value at top of stack: " + stack.peekFirst());
        System.out.println("value at top of stack: " + stack.peekLast());



    }

    static class GenericQueueClass<E> {
        E[] data;
        int index = 0;
        int arrayLength = 10;
        E temp;


        public GenericQueueClass() {
            data = (E[]) new Object[arrayLength];

        }

        public void push(E newData) {

            data[(data.length-1)- (data.length-1)] = newData; // places elements into array in reverse
            index--;

//            data[index] = newData;  // places elements into array in order
//            index++;

        }

        public E pop(E[] list) throws CustomException {
            try {

                if(list.length < 0){
                    throw new CustomException("current stack is empty");
                }
                E item = data[0];
                E[] copy = (E[]) new Object[data.length-1];

                for (int i = 0, j = 0; i < data.length; i++) {
                    if (i != 0) {
                        copy[j++] = (E) data[i];
                    }
                }
                return item;

            } catch (CustomException ex) {
                System.out.println("Exception: list is empty" + ex);
                return null;
            }
        }

        public int empty() {
            return data.length;
        }

        public void printOutStack(){
            for(int i = 0; i < data.length; i++){
                System.out.println(data[i]);
            }
        }


        public void resizeArray(){
            if (data.length < (arrayLength / .75) ){
                data = (E[]) new Object[arrayLength*2];
            }
            if (data.length < (arrayLength / .25) ){
                data = (E[]) new Object[arrayLength/2];
            }
        }

        public E peekFirst(){
           return data[0];

        }

        public E peekLast(){
            return data[data.length-1];
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
            return data.length;
        }


    }
}


