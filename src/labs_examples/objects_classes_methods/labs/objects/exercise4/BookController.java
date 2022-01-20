package labs_examples.objects_classes_methods.labs.objects.exercise4;

public class BookController {
    public static void main(String[] args) {

        Book bookOne = new Book();
        Book bookTwo = new Book(10);
        Book bookThree = new Book(12,560);

        System.out.println("Number of chapters in book 1 = " + bookOne.getChapters());
        System.out.println("Number of chapters in book 2 = " + bookTwo.getChapters());
        System.out.println("Number of pages in book 3 = " + bookThree.getPages());

        System.err.println("try again");



    }
}

