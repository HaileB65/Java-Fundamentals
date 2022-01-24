package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.solarsystemexample;

public class SolarSystemController {
    public static void main(String[] args) {

        SolarSystem milkyWay = new SolarSystem("Milky Way", 8, true);
        SolarSystem proximaCentauri = new SolarSystem("Proxima Centauri", 2);
        Planet earth = new Planet("Earth",1, true , true);

        System.out.println(milkyWay);
        System.out.println(proximaCentauri);
        System.out.println(earth);

        milkyWay.explore();
        earth.explore();

        earth.scanObject();
        earth.scanForLife();
        earth.launchProbe(7);
        proximaCentauri.scanObject();
        proximaCentauri.scanForLife();
        proximaCentauri.launchProbe(5);
    }
}
