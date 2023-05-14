/**
 * Author SKerpanSchaefer
 * Since5/13/2023
 * Version 1.0
 */
import java.util.Scanner;

public class SimpleMethod2 {
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int result = square(number);
        System.out.println("The square of " + number + " is " + result);
    }
}
