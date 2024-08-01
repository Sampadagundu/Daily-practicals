//Write a program to accept 3 digit no from the user and check it is armtrong or not

import java.util.Scanner;

// Class to check if a 3-digit number is an Armstrong number
public class ArmstrongNumber {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        
        // Declare variables to store the number, its copy, sum of cubes of digits, and individual digits
        int number, originalNumber, sumOfCubes, digit;
        
        // Read the number from the user
        number = scanner.nextInt();

        // Check if the number is a 3-digit number
        if (number < 100 || number > 999) {
            System.out.println("The number is not a 3-digit number.");
        } else {
            // Copy the number to another variable to perform operations
            originalNumber = number;
            // Initialize sumOfCubes to store the sum of cubes of each digit
            sumOfCubes = 0;

            // Loop to calculate the sum of cubes of each digit
            while (originalNumber != 0) {
                // Get the last digit of the number
                digit = originalNumber % 10;
                // Add the cube of the digit to sumOfCubes
                sumOfCubes += digit * digit * digit;
                // Remove the last digit from the number
                originalNumber /= 10;
            }

            // Check if the sum of cubes is equal to the original number
            if (sumOfCubes == number) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
