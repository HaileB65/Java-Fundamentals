package labs_examples.objects_classes_methods.labs.objects;

public class PersonDogAssociation{
    public static void main(String[] args) {

        Person p = new Person("Chris");
        Dog d = new Dog("Rex");

        System.out.println(p.name + " has a dog named " + d.name); // demonstrating object association

    }
}

class Person {

    public static String name;
    public Person(String name){
        this.name = name;
    }

    public static String getName() {
        return name;
    }
}

class Dog {
    public static String name;
    public Dog(String name){
        this.name = name;
    }

    public static String getName() {
        return name;
    }
}
