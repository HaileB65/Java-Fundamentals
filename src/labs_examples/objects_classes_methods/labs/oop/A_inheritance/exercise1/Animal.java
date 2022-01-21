package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class Animal {
    public String name;
    public int numbLegs;
    public boolean hasFur;

    public Animal(String name, int numbLegs, boolean hasFur){
        this.name = name;
        this.numbLegs = numbLegs;
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", numbLegs=" + numbLegs +
                ", hasFur=" + hasFur +
                '}';
    }
}
