package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class Primate extends Mammal {
    public boolean hasTail;

    public Primate(String name, int numbLegs, boolean hasFur, boolean hasTail){
        super(name, numbLegs, hasFur);
        this.hasTail = hasTail;
    }
    @Override
    public void holdAnimal(){
        System.out.println("Holding Animal");
    }

    @Override
    public String toString() {
        return "Primate{" +
                "name='" + name + '\'' +
                ", numbLegs=" + numbLegs +
                ", hasFur=" + hasFur +
                ", hasTail=" + hasTail +
                '}';
    }
}
