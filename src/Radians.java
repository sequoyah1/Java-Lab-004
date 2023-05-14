/**
 * Author SKerpanSchaefer
 * Since5/13/2023
 * Version 1.0
 */

import java.util.Scanner;

public class Radians {

private static final double PI = 3.14159265358979323846264338327950288419716939937;

    public static double toRadians(double degrees) {
       return degrees * PI /180.0;
    }

    public static double toDegrees(double radians) {
        return radians * 180.0 / PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Degrees to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());
        System.out.println("Converted to radians using Math.toRadians: " + Math.toRadians(degrees));
        System.out.print("Radians to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());
        System.out.println("Converted using Math.toDegrees: " + Math.toDegrees(radians));
    }
}
