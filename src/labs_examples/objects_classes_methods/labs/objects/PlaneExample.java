package labs_examples.objects_classes_methods.labs.objects;

public class PlaneExample {
    public static void main(String[] args) {

        Engine myEngine = new Engine(30843);
        Weight myWeight = new Weight(187000);
        Fuel myFuel = new Fuel(187000, 99000);

        Plane myPlane = new Plane(myEngine, myWeight, myFuel);
        System.out.println(myPlane);

    }


    static class Engine{
        private double horsePower;
        public Engine(double horsePower){
         this.horsePower = horsePower;
        }

//        public double getHorsePower() {
//            return horsePower;
//        }
//
//        public void setHorsePower(double horsePower) {
//            this.horsePower = horsePower;
//        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    static class Weight{
        private double maxPayload;

        public Weight(double maxPayload) {
            this.maxPayload = maxPayload;
        }

        @Override
        public String toString() {
            return "Weight{" +
                    "maxPayload=" + maxPayload +
                    '}';
        }
    }

    static class Fuel{
        private double fuelCapacity;
        private double currentFuelLevel;

        public Fuel(double fuelCapacity, double currentFuelLevel){
            this.fuelCapacity = fuelCapacity;
            this.currentFuelLevel = currentFuelLevel;
        }

        @Override
        public String toString() {
            return "Fuel{" +
                    "fuelCapacity=" + fuelCapacity +
                    ", currentFuelLevel=" + currentFuelLevel +
                    '}';
        }
    }

    static class Plane{
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


}
