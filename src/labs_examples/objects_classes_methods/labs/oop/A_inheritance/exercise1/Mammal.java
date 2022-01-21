package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class Mammal extends Animal{

    public Mammal(String name,int numbLegs, boolean hasFur){
        super(name, numbLegs, hasFur);

    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", numbLegs=" + numbLegs +
                ", hasFur=" + hasFur +
                '}';
    }
}
