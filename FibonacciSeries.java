//Write a program to display fibonaccion series from 0 to 78 
public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + ", " + second);

        // Initialize the next term (third term in the Fibonacci series)
        int next = first + second;

        // Loop until the next term is less than or equal to 78
        while (next <= 78) {
            System.out.print(", " + next);
            first = second;
            second = next;
            next = first + second;
        }
    }
}


