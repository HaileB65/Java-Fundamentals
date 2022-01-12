package labs_examples.objects_classes_methods.labs.objects;

public class BookController {
    public static void main(String[] args) {

        Books one = new Books();
        Books two = new Books(10);
        Books three = new Books(12,560);

        System.out.println("Number of chapters in book 1 = " + one.chapters);
        System.out.println("Number of chapters in book 2 = " + two.chapters);
        System.out.println("Number of pages in book 3 = " + three. pages);

    }
}

class Books {
    int chapters;
    int pages;

    public Books(){
    }

    public Books(int chapters){
        this.chapters = chapters;
    }

    public Books(int chapters, int pages){
        this.chapters = chapters;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "{" +
                "chapters=" + chapters +
                ", pages=" + pages +
                '}';
    }
}
