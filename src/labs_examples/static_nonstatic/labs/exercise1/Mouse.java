package labs_examples.static_nonstatic.labs.exercise1;

public class Mouse {
    String color;
    int weightInOunces;

    public Mouse(String color, int weightInOunces){
        this.color = color;
        this.weightInOunces = weightInOunces;

    }

    public static void dogeSnakeAttack(){
        Snake snake3 = new Snake("red",30);
        snake3.sneakUpOnMouse(); // 4) A static method, dogeSnakeAttack(), calling a non-static method, sneakUpOnMouse(), in another class

        Snake.snakeAttack(); // 3) A static method, dogeSnakeAttack(), calling a static method, snakeAttack(), in another class

        System.out.println("Mouse jumps over snake.");

    }

    public void scavenge(){
        System.out.println("Look for food.");

        Snake snake3 = new Snake("orange",22);
        snake3.huntForPrey(); // 6) A non-static method, scavenge(), calling a non-static method, huntForPrey(), in another class

        snake3.chaseMouse(); // 8) A non-static method, scavenge(), calling a static method, chaseMouse(), in another class. object snake3 had to be created  for this to work

        dogeSnakeAttack(); // 7) A non-static method, scavenge(), calling a static method, dogeSnakeAttack, in the same class

    }
}
