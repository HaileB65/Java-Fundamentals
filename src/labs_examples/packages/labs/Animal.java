package labs_examples.packages.labs;

public class Animal {
    String name;
    boolean hasFur;
    boolean canWalk;
    int averageWeightInPounds;

    public Animal(String name, boolean hasFur, boolean canWalk, int averageWeightInPounds){
        this.name = name;
        this.hasFur = hasFur;
        this.canWalk = canWalk;
        this.averageWeightInPounds = averageWeightInPounds;

    }

    public String getName() {
        return name;
    }
}
