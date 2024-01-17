package exercises.ex1sphereArea;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.System.in;
import static java.lang.System.out;

public class SphereArea {
    // TODO Fix the implementation by inserting the correct types!
    public static float theRadius;
    public static float theArea;

    // Hint: IntelliJ can help you out.
    public static final Scanner input = new Scanner(in);

    public static float inputRadius() {
        out.println("Give me a radius please > ");
        theRadius = input.nextFloat();
        return theRadius;
    }

    public static void printAreaResult(float theArea) {
        out.println("This is the area: " + theArea);
    }

    private static void calculateSphereAreaProgram() {
        // TODO implement program here
        theRadius = inputRadius();
        theArea = calculateArea(theRadius);
        printAreaResult(theArea);

    }

    private static float calculateArea(float radius) {
        return (float)(4 * PI * pow(radius, 2));
    }


    public static void main(String[] args) {
        calculateSphereAreaProgram();
    }


}
