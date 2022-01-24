package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.solarsystemexample;

public class SolarSystem implements ExploreInterface {
    public String name;
    public int numbOfPlanets;
    public boolean planetInGoldilocksZone;

    public SolarSystem(String name){
        this.name = name;
    }

    public SolarSystem(String name, int numbOfPlanets){
        this.name = name;
        this.numbOfPlanets = numbOfPlanets;
    }

    public SolarSystem(String name, int numbOfPlanets, boolean planetInGoldilocksZone){
        this.name = name;
        this.numbOfPlanets = numbOfPlanets;
        this. planetInGoldilocksZone = planetInGoldilocksZone;
    }

    public void explore(){
        System.out.println("---------------");
        System.out.println("Flying to " + name);
        System.out.println("Flying to center of solar system");
        System.out.println("Taking survey of number of planets in " + name);
    }

    public void scanObject(){
        System.out.println("---------------");
        System.out.println("Scanning Solar System");
    }
    public void scanForLife(){
        System.out.println("---------------");
        System.out.println("No life found");
    }
    public void launchProbe(int numbOfProbes){
        System.out.println("---------------");
        System.out.println("Three probes returned safely");
    }

    @Override
    public String toString() {
        return "SolarSystem{" +
                "name= '" + name + '\'' +
                ", numbOfPlanets=" + numbOfPlanets +
                ", planetInGoldilocksZone=" + planetInGoldilocksZone +
                '}';
    }
}
