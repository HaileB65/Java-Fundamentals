package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class Human extends Primate{

    public Human(String name, int numbLegs, boolean hasFur, boolean hasTail){
        super(name, numbLegs, hasFur, hasTail);
    }

    @Override
    public static void holdAnimal(){
        System.out.println("If a baby cradle in arms and support the head");
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", numbLegs=" + numbLegs +
                ", hasFur=" + hasFur +
                ", hasTail=" + hasTail +
                '}';
    }
}
