package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double pi = 3.14;
        double radius = 3.14;
        double radiusSquared = Math.pow(3.14, 2);
        int height = 5;
        System.out.println("Volume of a cylinder is = pi * radius^2 * height");
        System.out.println("pi= " + pi + "  radius= " + radius + "  height= " + height);

        System.out.println("Volume= " + (pi * radiusSquared * height));


        System.out.println("Surface Area of a cylinder is = 2*pi*radius*height + 2*pi*radius^2");
        double surfaceArea = 2 * pi * radius * height + 2 * pi * radiusSquared;
        System.out.println("Surface Area= " + surfaceArea);


    }
}