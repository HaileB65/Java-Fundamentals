package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exercise1;

public class AnimalExample {
    public static void main(String[] args) {

        Animal rat = new Animal("Rat",4, true);
        Mammal bear = new Mammal("Bear", 4, true);
        Primate monkey = new Primate("Monkey", 2, true, true);
        Human fred = new Human("Fred", 2, false, false);
        Gorilla silverBack = new Gorilla("SilverBack", 2,true,false);
        Reptile snake = new Reptile("Snake",0,false);

        System.out.println(rat);
        System.out.println(bear);
        System.out.println(monkey);
        System.out.println(fred);
        System.out.println(snake);

        System.out.println();

        rat.holdAnimal(); // runs holdAnimal() method from parent class called Animal
        monkey.holdAnimal(); // runs holdAnimal() method from subclass Primate
        fred.holdAnimal(); // runs holdAnimal() method from subclass Human
        silverBack.holdAnimal(); // runs holdAnimal() method from subclass Gorilla




    }
}
