package labs_examples.generics.labs.exercise_01;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class FirstGenericClass<T, U>{
    T val;
    U val2;

    FirstGenericClass(T val, U val2){
        this.val = val;
        this.val2 = val2;
    }

    public T getVal(){
        return val;
    }
    public void setVal(T val){
        this.val = val;
    }

    public U getVal2() {
        return val2;
    }

    public void setVal2(U val2) {
        this.val2 = val2;
    }
}

class FirstGenericClassExample{
    public static void main(String[] args) {
        FirstGenericClass obj = new FirstGenericClass(25, "Hello!"); // using generic method constructor
        FirstGenericClass obj2 = new FirstGenericClass(5.5, "H");
        FirstGenericClass obj3 = new FirstGenericClass(8.1021, "Hi");

        System.out.println(obj.getVal());
        System.out.println(obj.getVal2());
        System.out.println();
        System.out.println(obj2.getVal());
        System.out.println(obj2.getVal2());
        System.out.println();
        System.out.println(obj3.getVal());
        System.out.println(obj3.getVal2());
    }
}
