package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Planet extends SolarSystem {
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
        System.out.println("Landing on planet");
        System.out.println("Taking sample");
        System.out.println("Surveying 2 mile radius around base");
        System.out.println("Lifting off back to orbit");

    }

    @Override
    public String toString() {
        return "Planet{" +
                "numbOfMoons=" + numbOfMoons +
                ", hasAtmosphere=" + hasAtmosphere +
                ", hasLife='" + hasLife + '\'' +
                '}';
    }
}
