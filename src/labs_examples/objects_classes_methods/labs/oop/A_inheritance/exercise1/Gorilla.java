package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class Gorilla extends Primate {

    public Gorilla(String name, int numbLegs, boolean hasFur, boolean hasTail){
        super(name, numbLegs, hasFur, hasTail);
    }
    @Override
    public void holdAnimal(){
        System.out.println("Gorilla to large to hold");
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
