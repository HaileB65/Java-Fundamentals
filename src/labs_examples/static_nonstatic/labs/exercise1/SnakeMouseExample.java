package labs_examples.static_nonstatic.labs.exercise1;

public class SnakeMouseExample {
    public static void main(String[] args) {
        Snake snake = new Snake("brown",8);
        Mouse mouse = new Mouse("white",1);

        mouse.scavenge();
    }
}
