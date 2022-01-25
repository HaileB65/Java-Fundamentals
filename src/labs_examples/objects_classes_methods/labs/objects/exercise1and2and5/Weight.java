package labs_examples.objects_classes_methods.labs.objects.exercise1and2and5;

public class Weight {
    private double maxPayload;

    public Weight(double maxPayload) {
        this.maxPayload = maxPayload;
    }

    public double getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(double newMaxPayload) {
        this.maxPayload = newMaxPayload;
    }

    @Override
    public String toString() {
        return "Weight{" +
                "maxPayload=" + maxPayload +
                '}';
    }
}
