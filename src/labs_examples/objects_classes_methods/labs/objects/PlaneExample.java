package labs_examples.objects_classes_methods.labs.objects;

public class PlaneExample {
    public static void main(String[] args) {

        Fuel myFuel = new Fuel(600, 450);

    }

    class Velocity {
        byte speed;
        public Velocity(byte speed){
            this.speed = speed;

        }

        @Override
        public String toString() {
            return "Velocity{" +
                    "speed=" + speed +
                    '}';
        }
    }

    class Make{
        String color;

        public Make(String color) {
            this.color = color;
        }
    }
    class WheelQuantity{

    }

    static class Fuel{
        double fuelCapacity;
        double currentFuelLevel;

        public Fuel(double fuelCapacity, double
                currentFuelLevel)){
            this.fuelCapacity = fuelCapacity;
            this.currentFuelLevel = currentFuelLevel;
        }

        @Override
        public String toString() {
            return "Fuel{" +
                    "fuelCapacity=" + fuelCapacity +
                    '}';
        }
    }


}
