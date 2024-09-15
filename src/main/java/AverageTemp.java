// Author: Maz R-- Data Structures & Algorithms -- Sep 15 2024

import java.util.Scanner;

public class AverageTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt user input for the number of days
        System.out.print("Enter the number of days: ");
        int numDays = scanner.nextInt();
        scanner.nextLine();

        // Prompt the user to input temperature values for all days in one line
        System.out.println("Enter the temperature values for " + numDays + " days (separated by spaces):");
        String tempInput = scanner.nextLine();

        // Calculate the average temperature
        Scanner tempScanner = new Scanner(tempInput);
        double sum = 0;
        for (int i = 0; i < numDays; i++) {
            sum += tempScanner.nextDouble();
        }
        tempScanner.close();
        double average = sum / numDays;

        // Count how many temperatures are above the average
        tempScanner = new Scanner(tempInput);
        int countAboveAverage = 0;
        for (int i = 0; i < numDays; i++) {
            if (tempScanner.nextDouble() > average) {
                countAboveAverage++;
            }
        }
        tempScanner.close();

        // Output the results
        System.out.printf("\nAverage temperature: %.2f\n", average);
        System.out.println("Number of days above average: " + countAboveAverage);

        scanner.close();
    }
}
