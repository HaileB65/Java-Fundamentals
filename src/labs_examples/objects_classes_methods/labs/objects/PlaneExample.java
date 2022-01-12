package labs_examples.objects_classes_methods.labs.objects;

public class PlaneExample {
    public static void main(String[] args) {

        Engine myEngine = new Engine(30843);
        Weight myWeight = new Weight(187000);
        Fuel myFuel = new Fuel(187000, 99000);

        Plane myPlane = new Plane(myEngine, myWeight, myFuel);
        System.out.println(myPlane);

        myEngine.setHorsePower(20243); // using setter method to set a new horsepower number
        System.out.println("\nNew horsepower = " + myEngine.getHorsePower()); // using getter method to retrieve new horsepower number
        myWeight.setMaxPayload(99000); // setting new maxpayload number
        System.out.println("New maxPayload = " + myWeight.getMaxPayload()); // using getter method to retrieve new max payload number
        myFuel.setFuelCapacity(86000);
        System.out.println("New fuel capacity = " + myFuel.getFuelCapacity());
        myFuel.setCurrentFuelLevel(6000);
        System.out.println("New current fuel level = " + myFuel.getCurrentFuelLevel());

        System.out.println(myEngine); // using to tostring() method in Engine class to print out values of each variable in Engine class
        System.out.println(myFuel); // using to tostring() method in Fuel class to print out values of each variable in Fuel class

        //part of exercise 5
        Books narnia = new Books();
        Books harryPotter = new Books(25);
        Books aladdin = new Books(12,110);

        System.out.println("\n" + "Part of exercise 5 problem 3");
        System.out.println("Number of chapters and pages in Narnia " + narnia);
        System.out.println("Number of chapters and pages in Harry Potter " + harryPotter);
        System.out.println("Number of chapters and pages in Aladdin " + aladdin);



    }


    static class Engine{
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

    static class Weight{
        private double maxPayload;

        public Weight(double maxPayload) {
            this.maxPayload = maxPayload;
        }

        public double getMaxPayload() {
            return maxPayload;
        }

        public void setMaxPayload(double newmaxPayload) {
            this.maxPayload = newmaxPayload;
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
