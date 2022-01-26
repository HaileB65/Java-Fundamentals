package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.motorcycleexample;

public class MotorcycleExample {
    public static void main (String[] args){

        Motorcycle ducatiMonster = new Motorcycle("Ducati Monster", 937);
        Motorcycle slingShot = new Motorcycle("Sling Shot", 2384, 3);
        Sport kawasakiNinja = new Sport("Kawasaki Ninja", 350);
        Cruiser hondaRebel = new Cruiser("Honda Rebel 300", 300);
        SuperSport kawasakiZX10R = new SuperSport("Kawasaki ZX-10R", 998);


        System.out.println(ducatiMonster);
        System.out.println(slingShot);
        System.out.println(kawasakiNinja);
        System.out.println(hondaRebel);
        System.out.println(kawasakiZX10R);

        System.out.println();
        ducatiMonster.turnCorner(); //turnCorner() method from Motorcycle class
        hondaRebel.turnCorner(); // demonstrating overriding turnCorner() method from Motorcycle class

        System.out.println();
        ducatiMonster.start(); // demonstrating using StartStop interface
        ducatiMonster.accelerate(45);
        ducatiMonster.decelerate(30);
        ducatiMonster.stop();

        System.out.println();
        kawasakiNinja.start(); // demonstrating using StartStop interface
        kawasakiNinja.accelerate(45);
        kawasakiNinja.decelerate(30);
        kawasakiNinja.stop();

        // demonstrating using an interface as an instance variable.
        System.out.println();
        MotorizedVehicle morpho = new MotorizedVehicle(ducatiMonster);
        morpho.testVehicle(); // ducatiMonster set in previous line as motorcycle to be tested
        System.out.println("------------");
        morpho.setMotorizedVehicle(hondaRebel); // changed vehicle being used to hondaRebel
        morpho.testVehicle(); // testing hondaRebel



    }
}
