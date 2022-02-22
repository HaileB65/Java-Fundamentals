package labs_examples.packages.labs.land_animals;

import labs_examples.packages.labs.Animal;

public class Gorilla extends Animal {

    public Gorilla(String name, boolean hasFur, boolean canWalk, int averageWeightInPounds){
        super(name, hasFur, canWalk, averageWeightInPounds);

    }

    protected void buildNest(){
        System.out.println("Make nest");
    }

    public void climbTree(){
        System.out.println("Climb tree");
    }


}
