import java.util.Scanner;

public class FactorialNum {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t *Calculate Factorial of given Number* \n\n");
        
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        System.out.println();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        // Call the factorial method and display the result
        long res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }

        System.out.println("The factorial of " + num + " is: " + res);

        System.out.println("\n\n");
    }
    
}