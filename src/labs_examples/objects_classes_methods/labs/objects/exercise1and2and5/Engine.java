package labs_examples.objects_classes_methods.labs.objects.exercise1and2and5;

public class Engine {
    private double horsePower;
    public Engine(double horsePower){
        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double newHorsePower) {
        this.horsePower = newHorsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }
}
