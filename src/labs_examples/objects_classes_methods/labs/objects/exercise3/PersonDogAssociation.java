package labs_examples.objects_classes_methods.labs.objects.exercise3;

public class PersonDogAssociation{
    public static void main(String[] args) {

        Person p = new Person("Chris");
        Dog d = new Dog("Rex");

        System.out.println(p.name + " has a dog named " + d.name); // demonstrating object association

    }
}
