package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.motorcycleexample;

public class SuperSport extends Motorcycle implements StartStopInterface {

    public SuperSport(String name, int cc, int numbOfWheels){
        super(name, cc, numbOfWheels);
    }

    @Override
    public String toString() {
        return "SuperSport{" +
                "name='" + name + '\'' +
                ", cc=" + cc +
                ", numbOfWheels=" + numbOfWheels +
                '}';
    }

}
