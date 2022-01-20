package labs_examples.objects_classes_methods.labs.objects.exercise1and2and5;

public class Plane {
    private Engine engine;
    private Weight weight;
    private Fuel fuel;

    public Plane(Engine engine, Weight weight, Fuel fuel){
        this.engine = engine;
        this.weight = weight;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "engine=" + engine +
                ",\n weight=" + weight +
                ",\n fuel=" + fuel +
                '}';
    }
}
