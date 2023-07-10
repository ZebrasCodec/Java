//Samuel Maingi
//Assignment 03
//06/14/2023

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_03_If_Else_Statements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        int weight = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the age of the person: ");
                age = scanner.nextInt();

                System.out.print("Enter the weight of the person (in pounds): ");
                weight = scanner.nextInt();

                validInput = true; 

                if (age <= 10) {
                    if (weight < 80) {
                        System.out.println("This person needs to ride the black roller coaster.");
                    } else if (weight <= 200) {
                        System.out.println("This person needs to ride the green roller coaster.");
                    } else {
                        System.out.println("This person needs to ride the yellow roller coaster.");
                    }
                } else if (age <= 20) {
                    if (weight < 80) {
                        System.out.println("This person needs to ride the silver roller coaster.");
                    } else if (weight <= 200) {
                        System.out.println("This person needs to ride the red roller coaster.");
                    } else {
                        System.out.println("This person needs to ride the purple roller coaster.");
                    }
                } else {
                    System.out.println("This person needs to ride the pink roller coaster.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values only.");
                scanner.nextLine();
            }
        }
    }
}
