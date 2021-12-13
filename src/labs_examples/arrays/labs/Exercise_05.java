package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args){
     int[] array = {42,53,74,89,100,122};

     for(int i = array.length-1; i >= 0; i-=2){ // prints every other element in the array
         System.out.print(array[i] + " | "); //array[i] is the value at the index


     }


    }
}
