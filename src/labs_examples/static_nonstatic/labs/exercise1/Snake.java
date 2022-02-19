package labs_examples.static_nonstatic.labs.exercise1;

public class Snake {
    String color;
    int lengthInInches;

    public Snake(String color, int lengthInInches){
        this.color = color;
        this.lengthInInches = lengthInInches;

    }

    public static void chaseMouse(){
        Snake snake2 = new Snake("yellow",28);
        snake2.sneakUpOnMouse(); // 2) A static method, chaseMouse(), calling a non-static method, sneakUpOnMouse(), from the same class

        System.out.println("Snake chases mouse.");

        eatMouse(); // 1) a static method, chaseMouse(), calling a static method, eatMouse(), from the same class

    }

    public static void eatMouse(){
        System.out.println("Snake ate mouse.");

    }

    public void huntForPrey(){
        System.out.println("Snake goes hunting for a meal.");
        sneakUpOnMouse(); //5) A non-static method calling a non-static method in the same class
    }

    public void sneakUpOnMouse(){
        System.out.println("Sneak up on mouse.");

    }

    public static void snakeAttack(){
        System.out.println("Snake lunges at mouse");
    }
}
