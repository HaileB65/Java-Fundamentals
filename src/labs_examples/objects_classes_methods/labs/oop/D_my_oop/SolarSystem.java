package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

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

    public String isPlanetInGoldilocksZone() {
        if(planetInGoldilocksZone){
            return " has a plant(s) that reside in the Goldilocks Zone.";
        }else return " no planets that reside in the Goldilocks Zone.";
    }

    @Override
    public String toString() {
        return "The " + name + " solar system has " +
                numbOfPlanets +" planets and" + isPlanetInGoldilocksZone() ;
    }
}
