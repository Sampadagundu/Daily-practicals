//Q.4. . Write a Java program to find the number of even and odd integers in a given array of integers.
package com.Array;
public class EvenOddArray {

    public static void main(String[] args) {
        // Initialize the array of numbers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Initialize counters for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Iterate through each number in the array
        for (int number : numbers) {
            // Check if the number is even
            if (number % 2 == 0) {
                evenCount++; // Increment the even counter
            } else {
                oddCount++; // Increment the odd counter
            }
        }

        // Print the count of even numbers
        System.out.println("Number of even integers: " + evenCount);
        // Print the count of odd numbers
        System.out.println("Number of odd integers: " + oddCount);
    }
}

//Output:-
/*
Number of even integers: 5
Number of odd integers: 5
*/
