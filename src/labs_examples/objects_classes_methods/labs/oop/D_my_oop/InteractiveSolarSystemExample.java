package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
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
    static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Starting Solar System Tour");
        solarSystemTour();

    }

    public static void solarSystemTour() {

        createSolarSystemsAndPlanets();
        addPlanetNamesToArrayList();

        chooseASolarSystemScanner();

        chooseAPlanetScanner();

    }

    public static void addPlanetNamesToArrayList(){
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
        planets.add("Return");
        planets.add("Exit");
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

    public static void chooseASolarSystemScanner(){
        Scanner solarSystem = new Scanner(System.in);
        String solarSystemToExplore = "";

        while ((!solarSystemToExplore.equalsIgnoreCase("Milky Way") && !solarSystemToExplore.equalsIgnoreCase("Proxima Centauri"))) {
            System.out.println();
            System.out.println("Choose a solar system to explore.");
            System.out.println("Milky Way or Proxima Centauri");
            System.out.print("Enter solar system name: ");
            solarSystemToExplore = solarSystem.nextLine();

        }
        if (solarSystemToExplore.equalsIgnoreCase("Milky Way")) {
            milkyWay.explore();
            System.out.println(milkyWay);
            System.out.println("Milky Way planets: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune.");
        }else if (solarSystemToExplore.equalsIgnoreCase("Proxima Centauri")) {
            proximaCentauri.explore();
            System.out.println(proximaCentauri);

            Scanner scanner2 = new Scanner(System.in);
            String userInput2 = "";

            while((!userInput2.equalsIgnoreCase("Return"))){
                System.out.println();
                System.out.print("Enter 'return' to choose a different solar system: ");
                userInput2 = scanner2.nextLine();
            }
            chooseASolarSystemScanner();
        }else if(solarSystemToExplore.equalsIgnoreCase("Exit")){
            System.out.println("Solar System Tour over.");
            System.exit(0);
        }
    }

    public static void chooseAPlanetScanner(){
        Scanner scanner = new Scanner(System.in);
        String userInput ="";

        while(!planets.contains(userInput)){
            System.out.println();
            System.out.println("Milky Way planets: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune.");
            System.out.print("Enter which planet you would like to explore or enter 'return' to choose a different Solar System: ");
            userInput = scanner.nextLine();
        }

        if (userInput.equalsIgnoreCase("Mercury")){
            scanPlanetAndAskUserToExplorePlanet(mercury);
        }else if(userInput.equalsIgnoreCase("Venus")){
            scanPlanetAndAskUserToExplorePlanet(venus);
        }else if (userInput.equalsIgnoreCase("Earth")){
            scanPlanetAndAskUserToExplorePlanet(earth);
        }else if(userInput.equalsIgnoreCase("Mars")){
            scanPlanetAndAskUserToExplorePlanet(mars);
        }else if (userInput.equalsIgnoreCase("Jupiter")){
            scanPlanetAndAskUserToExplorePlanet(jupiter);
        }else if(userInput.equalsIgnoreCase("Saturn")){
            scanPlanetAndAskUserToExplorePlanet(saturn);
        }else if (userInput.equalsIgnoreCase("Uranus")){
            scanPlanetAndAskUserToExplorePlanet(uranus);
        }else if(userInput.equalsIgnoreCase("Neptune")){
            scanPlanetAndAskUserToExplorePlanet(neptune);
        }else if(userInput.equalsIgnoreCase("Return")){
            chooseASolarSystemScanner();
        }

    }

    public static void scanPlanetAndAskUserToExplorePlanet(Planet planet){
        planet.scanObject();
        planet.launchProbe(7);
        planet.scanForLife();
        System.out.println(planet);

        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while((!userInput.equalsIgnoreCase("Yes")) && (!userInput.equalsIgnoreCase("No"))){
            System.out.println();
            System.out.print("Fly to planet? Please enter yes or no:");
            userInput = scanner.nextLine();

        }

        if(userInput.equalsIgnoreCase("Yes")) {
            planet.explore();

            Scanner scanner2 = new Scanner(System.in);
            String userInput2 = "";

            while((!userInput2.equalsIgnoreCase("Return"))){
                System.out.println();
                System.out.print("Enter 'return' to return solar system: ");
                userInput2 = scanner2.nextLine();
            }
                System.out.println("Returning to solar System?");
                chooseAPlanetScanner();
        }else if(userInput.equalsIgnoreCase("No")) {
            System.out.println("User did not want to explore planet.");
            System.out.println("Returning to solar System.");
            chooseAPlanetScanner();
        }
    }

}
