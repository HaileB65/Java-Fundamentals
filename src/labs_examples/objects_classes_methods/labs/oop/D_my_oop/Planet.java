package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Planet extends SolarSystem implements ScanInterface {
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
        System.out.println("Landing on " + name);
        System.out.println("Taking sample");
        System.out.println("Surveying 2 mile radius around base");
        System.out.println("Lifting off back to orbit");

    }

    public void scanObject(){
        System.out.println("---------------");
        System.out.println("Flying to " + name);
        System.out.println("Scanning Planet");
    }
    public void scanForLife(){
        if (hasLife == true){
            System.out.println("Life found!");
        }else {
            System.out.println("No life found!");
        }
    }
    public void launchProbe(int numbOfProbes){
        System.out.println("Five probes returned safely");
    }

    public String getHasAtmosphere(){
        if(hasAtmosphere){
            return " has an atmosphere, and";
        }else return " does not have an atmosphere, and";
    }

    public String getHasLife(){
        if(hasLife){
            return " has life on planet.";
        }else return " shows no signs of life on planet";
    }

    @Override
    public String toString() {
        return name + " has " + numbOfMoons + " moon(s)," + getHasAtmosphere() +  getHasLife();
    }

}
