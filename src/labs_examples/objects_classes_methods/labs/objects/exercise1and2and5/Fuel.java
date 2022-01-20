package labs_examples.objects_classes_methods.labs.objects.exercise1and2and5;

public class Fuel {
    private double fuelCapacity;
    private double currentFuelLevel;

    public Fuel(double fuelCapacity, double currentFuelLevel){
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double newFuelCapacity) {
        this.fuelCapacity = newFuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double newCurrentFuelLevel) {
        this.currentFuelLevel = newCurrentFuelLevel;
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}
