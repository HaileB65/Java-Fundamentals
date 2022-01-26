package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.motorcycleexample;

public class SuperSport extends Motorcycle implements VehicleStartStop {

    public SuperSport(String name, int cc){
        super(name, cc);
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
