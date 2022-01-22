package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Planet {
    public int numbOfMoons;
    public boolean hasAtmosphere;
    boolean hasLife;

    public Planet(int numbOfMoons, boolean hasAtmosphere, boolean hasLife){
        super();
        this.numbOfMoons = numbOfMoons;
        this.hasAtmosphere = hasAtmosphere;
        this.hasLife = hasLife;

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
