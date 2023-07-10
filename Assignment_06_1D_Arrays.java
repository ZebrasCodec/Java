//Samuel Maingi
//Assignment 06_1D
//06/22/2023


import java.util.Arrays;
import java.util.Random;

public class Assignment_06_1D_Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        
        // Populate the array with random numbers between 1 and 100
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        
        // Calculate and print the average
        double average = calcAverage(numbers);
        System.out.printf("Average: %.2f%n", average);
        
        // Count the occurrences of each number and print the information
        countOccurrences(numbers);
    }
    
    public static double calcAverage(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (double) sum / array.length;
    }
    
    public static void countOccurrences(int[] array) {
        int[] counts = new int[100];
        for (int number : array) {
            counts[number - 1]++;
        }
        
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.printf("The number %d appears %d times.%n", i + 1, counts[i]);
            }
        }
    }
}



