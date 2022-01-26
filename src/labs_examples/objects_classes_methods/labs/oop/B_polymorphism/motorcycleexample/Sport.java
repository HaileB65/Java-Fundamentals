package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.motorcycleexample;

public class Sport extends Motorcycle implements VehicleStartStop {

    public Sport(String name, int cc){
        super(name, cc);
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
