package labs_examples.generics.labs.exercise_02;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;
import java.util.Collections;

class Demo<T> {
    T val;
    ArrayList<T> list = new ArrayList<>();

    Demo(T val){
        this.val = val;
    }

    public <T extends Number> double genericMethod(ArrayList<T> list){
        double sum = 0;

        for(int i=0; i < list.size(); i++){
            sum = sum + list.get(i).doubleValue();
        }

        System.out.println("Sum of all numbers in given ArrayList = "+ sum);
        return sum;
    }

    public T getVal(){
        return val;
    }
    public void setVal(T val){
        this.val = val;
    }

}

class FirstGenericClassExample{
    public static void main(String[] args) {
        Demo<Double> obj = new Demo<>(5.5); // example of using generic method constructor
        Collections. addAll(obj.list, 1.5, 2.5, 3.5, 4.5, 5.5);

        System.out.println("ArrayList list = " + obj.list);
        System.out.println();

        obj.genericMethod(obj.list);
    }
}