package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class Human extends Primate{

    public Human(String name, int numbLegs, boolean hasFur, boolean hasTail){
        super(name, numbLegs, hasFur, hasTail);
    }

    @Override
    public void holdAnimal(){
        System.out.println("If baby, cradle with both arms and support head");
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
