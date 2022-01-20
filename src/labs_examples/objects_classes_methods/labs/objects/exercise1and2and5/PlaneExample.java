package labs_examples.objects_classes_methods.labs.objects.exercise1and2and5;

import labs_examples.objects_classes_methods.labs.objects.exercise4.Book;

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
        Book narnia = new Book();
        Book harryPotter = new Book(25);
        Book aladdin = new Book(12,110);

        System.out.println("\n" + "Part of exercise 5 problem 3");
        System.out.println("Number of chapters and pages in Narnia " + narnia);
        System.out.println("Number of chapters and pages in Harry Potter " + harryPotter);
        System.out.println("Number of chapters and pages in Aladdin " + aladdin);

    }
}
