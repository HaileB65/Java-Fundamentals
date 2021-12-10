package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args){
        int[][] irregularArray = new int[2][]; // an irregular multidimensional array includes multiple arrays varying in size

        irregularArray[0] = new int[4]; // array at index 0 will have 4 elements
        irregularArray[1] = new int[2]; // array at index 0 will have 2 elements

        irregularArray[0][0] = 12; // populates the array at index 0 with 4 elements
        irregularArray[0][1] = 22;
        irregularArray[0][2] = 43;
        irregularArray[0][3] = 57;

        irregularArray[1][0] = 89; // populates the array at index 1 with 2 elements
        irregularArray[1][1] = 100;

        for(int[] column: irregularArray){ // for each loop prints out each element in the 2 dimensional irregular array
            for(int row: column){
                System.out.print(row + " | ");
            }
            System.out.println();
        }


    }
}
