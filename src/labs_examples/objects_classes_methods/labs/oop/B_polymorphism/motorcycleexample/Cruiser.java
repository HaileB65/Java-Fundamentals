package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.motorcycleexample;

public class Cruiser extends Motorcycle implements VehicleStartStop {

    public Cruiser(String name, int cc){
        super(name, cc);
    }


    @Override
    public void turnCorner(){
        System.out.println("With a heavier bike do not lean excessively to avoid crashing the bike");
    }

    @Override
    public String toString() {
        return "Cruiser{" +
                "name='" + name + '\'' +
                ", cc=" + cc +
                ", numbOfWheels=" + numbOfWheels +
                '}';
    }
}
