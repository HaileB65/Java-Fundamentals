package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.solarsystemexample;

public class Planet extends SolarSystem implements ExploreInterface {
    public int numbOfMoons;
    public boolean hasAtmosphere;
    boolean hasLife;

    public Planet(String name, int numbOfMoons, boolean hasAtmosphere, boolean hasLife){
        super(name);
        this.numbOfMoons = numbOfMoons;
        this.hasAtmosphere = hasAtmosphere;
        this.hasLife = hasLife;

    }

    @Override
    public void explore(){
        System.out.println("---------------");
        System.out.println("Flying to " + name);
        System.out.println("Landing on planet");
        System.out.println("Taking sample");
        System.out.println("Surveying 2 mile radius around base");
        System.out.println("Lifting off back to orbit");

    }

    public void scanObject(){
        System.out.println("---------------");
        System.out.println("Scanning Planet");
    }
    public void scanForLife(){
        System.out.println("---------------");
        System.out.println("Life found!");
    }
    public void launchProbe(int numbOfProbes){
        System.out.println("---------------");
        System.out.println("Five probes returned safely");
    }

    @Override
    public String toString() {
        return "Planet{" + "name= " + name +
                ", numbOfMoons=" + numbOfMoons +
                ", hasAtmosphere=" + hasAtmosphere +
                ", hasLife='" + hasLife + '\'' +
                '}';
    }
}
