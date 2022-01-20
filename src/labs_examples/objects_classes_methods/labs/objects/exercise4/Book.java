package labs_examples.objects_classes_methods.labs.objects.exercise4;

public class Book {
    private Integer chapters;
    private Integer pages;

    public Book(){
        this.chapters = 1;
        this.pages = 20;
    }

    public Book(int chapters){
        this.chapters = chapters;
    }

    public Book(int chapters, int pages){
        this.chapters = chapters;
        this.pages = pages;
    }

    public int getChapters(){
        return chapters;
    }

    public void setChapters(int chapters){
        this.chapters = chapters;
    }


    public int getPages(){
        return pages;
    }

    public void setPages(int pages){
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
