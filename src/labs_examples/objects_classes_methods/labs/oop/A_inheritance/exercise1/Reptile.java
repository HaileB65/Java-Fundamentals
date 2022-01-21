package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class Reptile extends Animal {

    public Reptile(String name, int numbLegs, boolean hasFur){
        super(name, numbLegs, hasFur);
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "name='" + name + '\'' +
                ", numbLegs=" + numbLegs +
                ", hasFur=" + hasFur +
                '}';
    }
}
