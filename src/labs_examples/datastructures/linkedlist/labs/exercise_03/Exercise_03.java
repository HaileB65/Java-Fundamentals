package labs_examples.datastructures.linkedlist.labs.exercise_03;

import labs_examples.datastructures.linkedlist.labs.exercise_02.CustomLinkedList;

/**
 *      LinkedLists - Exercise_02
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */

class Exercise_03 {
    public static void main(String[] args) {
            CustomDoubleLinkedList obj = new CustomDoubleLinkedList();


            obj.addNewNode("New York");
            obj.addNewNode("Los Angeles");
            obj.addNewNode("Chicago");
            obj.addNewNode("Houston");
            obj.addNewNode("Houston");

            obj.showData();

    }
}