package labs_examples.datastructures.linkedlist.labs.exercise_03;

import labs_examples.datastructures.linkedlist.labs.exercise_02.CustomLinkedList;

/**
 *      LinkedLists - Exercise_02
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */

class Exercise_03 {
    public static void main(String[] args) {
        CustomDoubleLinkedList doubleLinkedList = new CustomDoubleLinkedList();

        doubleLinkedList.addToFrontOfList("Me");
        doubleLinkedList.addToFrontOfList("You");
        doubleLinkedList.addToEndOfList("Us");
        doubleLinkedList.addToEndOfList("Them");

        System.out.println(doubleLinkedList.get(2));
        doubleLinkedList.printOutList(doubleLinkedList);

    }
}