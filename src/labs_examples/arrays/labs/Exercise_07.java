package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args){
        ArrayList<String> memberList = new ArrayList<String>();
        memberList.add("Kyle");
        memberList.add("Barbara");
        memberList.add("Larry");
        memberList.add("Shelly");

        System.out.println(memberList);
        System.out.println("Index two of the array list = " + memberList.get(2)); // printing out index 2 of the ArrayList


        System.out.println("ArrayList size = " + memberList.size()); // printing out array list size
        System.out.println("Is Shelly in the ArrayList?  = "+ memberList.contains("Shelly")); // checking if array list contains the word "Shelly"

        memberList.remove("Larry"); // removed Larry from the array list
        System.out.println(memberList);



    }
}
