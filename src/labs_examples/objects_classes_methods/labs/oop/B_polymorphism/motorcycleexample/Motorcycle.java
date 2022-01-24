package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.motorcycleexample;

public class Motorcycle implements StartStopInterface {
    public String name;
    public int cc;
    public int numbOfWheels;


    public Motorcycle(String name, int cc){
        this.name = name;
        this.cc = cc;
    }

    public Motorcycle(String name, int cc, int numbOfWheels){
        this.name = name;
        this.cc = cc;
        this.numbOfWheels = numbOfWheels;
    }

    public void turnCorner(){
        System.out.println("slightly lean at an angle with the bike towards the direction you want to go");
    }


    public void start(){
        System.out.println("Turn key clockwise");
    }
    public void accelerate(int mph){
        System.out.println("Accelerating to " + mph + "mph");
    }
    public void decelerate(int mph){
        System.out.println("Slowing down to " + mph + "mph");
    }
    public void stop(){
        System.out.println("Turn key counterclockwise");
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
