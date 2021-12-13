package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] twoDArray = new int[5][5];

        for (int i=0; i <twoDArray.length; i++){ // populates the 2DArray
            twoDArray[i][0] = ((i * 5)+ 1) * 3;
            for(int j=1; j<twoDArray[i].length; j++){
                twoDArray[i][j] = twoDArray[i][0] + (j * 3);
            }
        }

        for(int[] columns : twoDArray){ // prints out each element in the 2DArray
            for(int rows : columns){
                System.out.print(rows + " -> ");
            }
            System.out.println();
        }


    }
}
