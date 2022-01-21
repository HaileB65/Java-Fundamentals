package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class Gorilla extends Primate {

    public Gorilla(String name, int numbLegs, boolean hasFur, boolean hasTail){
        super(name, numbLegs, hasFur, hasTail);
    }

    @Override
    public static void holdAnimal(){
        System.out.println("Gorilla too heavy to hold");
    }

    @Override
    public String toString() {
        return "Gorilla{" +
                "name='" + name + '\'' +
                ", numbLegs=" + numbLegs +
                ", hasFur=" + hasFur +
                ", hasTail=" + hasTail +
                '}';
    }
}
