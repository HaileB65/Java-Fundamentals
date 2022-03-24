package labs_examples.generics.labs.exercise_03;


import java.util.*;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class GenericMethodsPractice<T, U> {
    T val;
    U val2;
    ArrayList<T> arrayList = new ArrayList<>();

    GenericMethodsPractice(T val, U val2){
        this.val = val;
        this.val2 = val2;
    }

    public T getVal(){
        return val;
    }
    public void setVal(T val){
        this.val = val;
    }

    public T getVal2(){
        return val;
    }
    public void setVal2(T val){
        this.val = val;
    }


    public <T extends Number, U extends Number> double sum(T val, U val2){ // 1)
        return val.doubleValue() * val2.doubleValue();
    }

    public <T extends Number> int countNumbOfElementsInCollection(ArrayList<T> c){ // 2)
        return c.size();
    }

    public <T> void switchingElements(T[] array, int index1, int index2){ // 3)
        if(index1 > array.length) {
            System.out.println("error");
            return;
        }
        if(index2 > array.length) {
            System.out.println("error");
            return;
        }
        System.out.println("3) Switching elements in generic array");
        System.out.print("Original array");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        System.out.print("Altered array");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public <T extends Comparable<? super T>> void findLargestElement(ArrayList<T> arrayList){ // 4)
        System.out.println();
        System.out.println("4) Find largest element in given array list");
        System.out.println("given array array list = " + arrayList);
        System.out.println("Largest element = " + Collections.max(arrayList));
    }

}

class GenericMethodsDriver {
    public static void main(String[] args) {

        GenericMethodsPractice obj = new GenericMethodsPractice("hello", 55); // example of using generic method constructor

        double r = obj.sum(7, 5.112387); //  1)
        System.out.println("1) Sum of two generic arguments from Number class = " + r);
        System.out.println();

        Collections. addAll(obj.arrayList, "Madam", "Racecar", "Civic", "Deified", "Hannah", "Level"); //2)
        System.out.println("2) Collection ArrayList 'c' = " +obj.arrayList);
        System.out.println("Size of array list 'c' = " + obj.countNumbOfElementsInCollection((ArrayList) obj.arrayList));
        System.out.println();

        obj.switchingElements(new Integer[]{0,1,2,3,4},0,3); // 3)

        obj.findLargestElement(new ArrayList<Integer>(Arrays.asList(0,1,2,3,4))); // 4)


    }
}