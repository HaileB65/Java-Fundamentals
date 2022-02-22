package labs_examples.packages.labs.sea_creatures;

import labs_examples.packages.labs.Animal;

public class Whale extends Animal {

    public Whale(String name, boolean hasFur, boolean canWalk, int averageWeightInPounds){
        super(name, hasFur, canWalk, averageWeightInPounds);

    }

    protected void dive(){
        System.out.println("Dive to 500 ft");
    }

    public void breachForAir(){
        System.out.println("Breach for air");
    }


}
