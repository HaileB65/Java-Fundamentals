package labs_examples.datastructures.linkedlist.labs.exercise_02;


public class CustomLinkedList<T> {

    class Node<T> {
         T data;
         Node next;



        public Node(T data) {
            this.data = data;
            this.next = null;
        }


        public Node(T data, Node node) {
            this.data = data;
            this.next = node;
        }
    }

    private Node head;


    @SafeVarargs
    public CustomLinkedList(T... data) {
            head = null;
    }

    public void printOutList(CustomLinkedList<T> list){
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void addToFrontOfList(T newData){
        Node new_node = new Node(newData); // pushes new data to front of  the list
        new_node.next = head;
        head = new_node;
    }

    public void addToEndOfList(T newData){
        Node iterator = head; // reference to head node

        Node previous = null; // track previous node


            while (iterator.next != null) {
                iterator = iterator.next;
            }

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

            int count = 0;



            Node iterator = head;



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
