package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Objects;
import java.util.Scanner;

public class InteractiveSolarSystemExample {
    public static void main(String[] args) {
        System.out.println("loading game");

        SolarSystem milkyWay = new SolarSystem("Milky Way", 8, true); // creating solar systems
        SolarSystem proximaCentauri = new SolarSystem("Proxima Centauri", 2);           // and planet objects
        Planet venus = new Planet("Venus",0, true , false);
        Planet mercury = new Planet("Mercury",0, false , false);
        Planet earth = new Planet("Earth",1, true , true);
        Planet mars = new Planet("Mars",2, true , false);
        Planet jupiter = new Planet("Jupiter",53, true , false);
        Planet saturn = new Planet("Saturn",53, true , false);
        Planet uranus = new Planet("Uranus",27, true , false);
        Planet neptune = new Planet("Neptune",14, true , false);

        System.out.println("Starting SolarSystem Tour");

        System.out.println("Choose a solar system to explore");
        System.out.println("Milky Way or Proxima Centauri ");

        Scanner system = new Scanner(System.in); // this block of code asks player to enter name and player wallet total
        System.out.print("Enter solar system name: ");
        String solarSystemToExplore = system.next();

        if(Objects.equals(solarSystemToExplore, "Proxima Centauri")){
            System.out.println();
            System.out.println(proximaCentauri);
        }

        if(Objects.equals(solarSystemToExplore, "Milky Way")){
            milkyWay.explore();
            System.out.println(milkyWay);

            System.out.println("Milky Way planets: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune.");

            System.out.println("Enter which planet you would like to explore");

            earth.explore();

            earth.scanObject();
            earth.scanForLife();
            earth.launchProbe(7);

        }

        System.out.println();
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
