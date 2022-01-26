package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.motorcycleexample;

public class MotorizedVehicle {
    VehicleStartStop motorcycle; // demonstrating an interface being used as an instance variable

    public MotorizedVehicle(VehicleStartStop motorcycle){ // Constructor for interface being used as an instance variable.
        this.motorcycle = motorcycle;       // Now any class that implements the MotorizedVehicle interface can now be used to
    }                                 // satisfy the instance variable "bike".


    public void setMotorizedVehicle(VehicleStartStop motorcycle){
        this.motorcycle = motorcycle;
    }

    public void testVehicle(){
        motorcycle.start();
        motorcycle.accelerate(65);
        motorcycle.decelerate(55);
        motorcycle.stop();
    }
}
