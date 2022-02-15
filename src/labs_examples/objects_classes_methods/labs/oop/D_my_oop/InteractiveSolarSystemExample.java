package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.Scanner;

public class InteractiveSolarSystemExample {
    static SolarSystem milkyWay;
    static SolarSystem proximaCentauri;
    static Planet venus;
    static Planet mercury;
    static Planet earth;
    static Planet mars;
    static Planet jupiter;
    static Planet saturn;
    static Planet uranus;
    static Planet neptune;
    public static void main(String[] args) {
        System.out.println("Starting SolarSystem Tour");
        solarSystemTour();

    }

    public static void solarSystemTour() {

        createSolarSystemsAndPlanets();

        chooseASolarSystem();

        chooseAPlanet();

        System.out.println("Return to solar System?");

    }

    public static void createSolarSystemsAndPlanets(){
        milkyWay = new SolarSystem("Milky Way", 8, true); // creating solar systems
        proximaCentauri = new SolarSystem("Proxima Centauri", 2);           // and planet objects
        venus = new Planet("Venus", 0, true, false);
        mercury = new Planet("Mercury", 0, false, false);
        earth = new Planet("Earth", 1, true, true);
        mars = new Planet("Mars", 2, true, false);
        jupiter = new Planet("Jupiter", 53, true, false);
        saturn = new Planet("Saturn", 53, true, false);
        uranus = new Planet("Uranus", 27, true, false);
        neptune = new Planet("Neptune", 14, true, false);
    }

    public static void chooseASolarSystem(){
        Scanner solarSystem;
        String solarSystemToExplore;
        do {
            System.out.println();
            System.out.println("Choose a solar system to explore");
            System.out.println("Milky Way or Proxima Centauri");

            solarSystem = new Scanner(System.in);
            System.out.print("Enter solar system name: ");
            solarSystemToExplore = solarSystem.nextLine();

            if (solarSystemToExplore.equals("Milky Way")) {
                milkyWay.explore();
                System.out.println(milkyWay);
                System.out.println("Milky Way planets: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune.");
                break;

            } else if (solarSystemToExplore.equals("Proxima Centauri")) {
                proximaCentauri.explore();
                System.out.println(proximaCentauri);
                System.out.println("Proxima Centauri planets: ");
                break;
            } else {
                System.out.println("Solar system entered not found. Please try and enter the solar system name again.");
            }
        } while ((!solarSystemToExplore.equals("Milky Way") || !solarSystemToExplore.equals("Proxima Centauri")));
    }

    public static void chooseAPlanet(){
        System.out.println();
        System.out.println("Enter which planet you would like to explore");
        System.out.println("Milky Way planets: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune.");

        Scanner flyTo;
        String flyToPlanet;
        do {
            System.out.println();
            flyTo = new Scanner(System.in);
            System.out.print("Enter planet name: ");
            flyToPlanet = flyTo.nextLine();

            if (flyToPlanet.equals("Earth")) {
                earth.scanObject();
                earth.launchProbe(7);
                earth.scanForLife();
                System.out.println(earth);
                askUserToExplorePlanet();
                if (askUserToExplorePlanet() == true) {
                    earth.explore();
                } else if (askUserToExplorePlanet() == false) {
                    System.out.println("User did not want ot explore planet.");
                    break;
                }

            } else if (flyToPlanet.equals("Mars")) {
                mars.scanObject();
                mars.launchProbe(5);
                mars.scanForLife();
                System.out.println(mars);
                askUserToExplorePlanet();
                break;
            }else {
                System.out.println("Planet entered not found. Please try and enter the planet name again.");
            }
        }while((!flyToPlanet.equals("Earth")) || (!flyToPlanet.equals("Mars")));
    }

    public static boolean askUserToExplorePlanet(){
        Scanner askToExploreScanner = new Scanner(System.in);
        String wantToExplorePlanet = "";

        while((!wantToExplorePlanet.equalsIgnoreCase("Yes")) && (!wantToExplorePlanet.equalsIgnoreCase("No"))){
            System.out.println();
            System.out.print("Fly to planet?");
            System.out.println("Please enter yes or no.");
            wantToExplorePlanet = askToExploreScanner.nextLine();

        }

        if (wantToExplorePlanet.equalsIgnoreCase("Yes")) {
            return true;
        }else {
            return false;
        }

    }


}
