package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.motorcycleexample;

public class Sport extends Motorcycle implements StartStopInterface {

    public Sport(String name, int cc, int numbOfWheels){
        super(name, cc, numbOfWheels);
    }

    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", cc=" + cc +
                ", numbOfWheels=" + numbOfWheels +
                '}';
    }

}
