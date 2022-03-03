package labs_examples.packages.labs;


import labs_examples.packages.labs.land_animals.Gorilla;
import labs_examples.packages.labs.sea_creatures.Whale;

public class DemonstratingPackageAccessControl {
    public static void main(String[] args) {
        Gorilla sliverback = new Gorilla("Sliverback",true,true,450);
        Whale blueWhale = new Whale("Blue Whale",false,false,310000);

       //sliverback.buildNest(); // protected methods not accessible in a different package
       // blueWhale.dive();

        sliverback.climbTree(); // public methods accessible in a different package
        blueWhale.breachForAir();


    }
}
