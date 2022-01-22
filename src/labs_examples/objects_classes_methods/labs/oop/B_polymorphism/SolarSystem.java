package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class SolarSystem {
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

    @Override
    public String toString() {
        return "SolarSystem{" +
                "name='" + name + '\'' +
                ", numbOfPlanets=" + numbOfPlanets +
                ", planetInGoldilocksZone=" + planetInGoldilocksZone +
                '}';
    }
}
