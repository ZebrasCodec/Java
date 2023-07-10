//Samuel Maingi
//Assignment 05
//06/14/2023

import java.util.Scanner;

public class Strings_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input 3 city names separated by spaces in one line and press Enter:");
        String input = scanner.nextLine();

        String city1 = "";
        String city2 = "";
        String city3 = "";

        int firstSpaceIndex = input.indexOf(' ');
        int lastSpaceIndex = input.lastIndexOf(' ');

        if (firstSpaceIndex != -1 && lastSpaceIndex != -1) {
            city1 = input.substring(0, firstSpaceIndex);
            city2 = input.substring(firstSpaceIndex + 1, lastSpaceIndex);
            city3 = input.substring(lastSpaceIndex + 1);
        }

        if (city1.compareTo(city2) <= 0 && city1.compareTo(city3) <= 0) {
            System.out.println(city1);
            if (city2.compareTo(city3) <= 0) {
                System.out.println(city2);
                System.out.println(city3);
            } else {
                System.out.println(city3);
                System.out.println(city2);
            }
        } else if (city2.compareTo(city1) <= 0 && city2.compareTo(city3) <= 0) {
            System.out.println(city2);
            if (city1.compareTo(city3) <= 0) {
                System.out.println(city1);
                System.out.println(city3);
            } else {
                System.out.println(city3);
                System.out.println(city1);
            }
        } else {
            System.out.println(city3);
            if (city1.compareTo(city2) <= 0) {
                System.out.println(city1);
                System.out.println(city2);
            } else {
                System.out.println(city2);
                System.out.println(city1);
            }
        }
    }
}
