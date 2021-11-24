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


     for(int val : array){ // prints every other element in the array
         if(val % 2 == 0){
             System.out.print(val + " | ");
         }
     }
        System.out.println();
        System.out.println("----------");

        for(int val = array.length-1; val>=0; val--){ // prints out the array backwards and skips every other element
            if(val % 2 == 0){
                System.out.print(array[val] + " | ");
            }
        }


    }
}
