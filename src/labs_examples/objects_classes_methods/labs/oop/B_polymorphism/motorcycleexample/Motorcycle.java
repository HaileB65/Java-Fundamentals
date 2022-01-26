package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.motorcycleexample;

public class Motorcycle implements VehicleStartStop {
    public String name;
    public int cc;
    public int numbOfWheels;


    public Motorcycle(String name, int cc){
        this.name = name;
        this.cc = cc;
        this.numbOfWheels = 2;
    }


    public Motorcycle(String name, int cc, int numbOfWheels){
        this.name = name;
        this.cc = cc;
        this.numbOfWheels = numbOfWheels;
    }


    public void turnCorner(){
        System.out.println("Slightly lean at an angle with the bike towards the direction you want to go");
    }


    public void start(){
        System.out.println(name + ":");
        System.out.println("Turn key clockwise to start ");
    }
    public void accelerate(int mph){
        System.out.println("Accelerating to " + mph + "mph");
    }
    public void decelerate(int mph){
        System.out.println("Slowing down to " + mph + "mph");
    }
    public void stop(){
        System.out.println("Squeeze hand brake until bike comes to a full stop");
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", cc=" + cc +
                ", numbOfWheels=" + numbOfWheels +
                '}';
    }
}
