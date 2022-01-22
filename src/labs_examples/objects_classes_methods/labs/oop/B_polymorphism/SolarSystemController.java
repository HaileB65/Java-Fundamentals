package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class SolarSystemController {
    public static void main(String[] args) {

        SolarSystem jupiter = new SolarSystem("Milky Way", 8, true);
        Planet earth = new Planet(1,true, true);

        System.out.println(jupiter);
    }
}
