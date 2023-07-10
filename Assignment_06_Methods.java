//Samuel Maingi
//Assignment 06
//06/14/2023

import java.util.Scanner;

public class Assignment_06_Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = scanner.nextInt();

        System.out.print("Enter the length of the sides: ");
        double side = scanner.nextDouble();

        double area = area(n, side);
        System.out.println("The area of the polygon is: " + area);
    }

    public static double area(int n, double side) {
        double numerator = n * Math.pow(side, 2);
        double denominator = 4 * Math.tan(Math.PI / n);
        return numerator / denominator;
    }
}
