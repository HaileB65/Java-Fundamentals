package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Objects;
import java.util.Scanner;

public class InteractiveSolarSystemExample {
    public static void main(String[] args) {
        System.out.println("Starting SolarSystem Tour");
        System.out.println();
        solarSystemTour();



    }

    public static void solarSystemTour(){

        SolarSystem milkyWay = new SolarSystem("Milky Way", 8, true); // creating solar systems
        SolarSystem proximaCentauri = new SolarSystem("Proxima Centauri", 2);           // and planet objects
        Planet venus = new Planet("Venus",0, true , false);
        Planet mercury = new Planet("Mercury",0, false , false);
        Planet earth = new Planet("Earth",1, true , true);
        Planet mars = new Planet("Mars",2, true , false);
        Planet jupiter = new Planet("Jupiter",53, true , false);
        Planet saturn = new Planet("Saturn",53, true , false);
        Planet uranus = new Planet("Uranus",27, true , false);Planet neptune = new Planet("Neptune",14, true , false);


        System.out.println("Choose a solar system to explore");
        System.out.println("Milky Way or Proxima Centauri");

        Scanner solarSystem = new Scanner(System.in);
        System.out.print("Enter solar system name: ");
        String solarSystemToExplore = solarSystem.nextLine();

        if(solarSystemToExplore.equals("Milky Way")){
            System.out.println();
            milkyWay.explore();
            System.out.println(milkyWay);
            System.out.println("Milky Way planets: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune.");

        }else if(solarSystemToExplore.equals("Proxima Centauri")){
            System.out.println();
            System.out.println(proximaCentauri);
        }

        System.out.println();
        System.out.println("Enter which planet you would like to explore");
        System.out.println("Milky Way planets: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune.");

        Scanner planet = new Scanner(System.in);
        System.out.print("Enter planet name: ");
        String planetToExplore = planet.nextLine();

        if(planetToExplore.equals("Earth")){
            earth.explore();
            earth.scanObject();
            earth.scanForLife();
            earth.launchProbe(7);
            System.out.println(earth);

        }else if(planetToExplore.equals("Mars")){
            System.out.println();
            System.out.println(proximaCentauri);
        }



    }
}
