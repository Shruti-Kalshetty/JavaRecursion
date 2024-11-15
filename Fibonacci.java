public class Fibonacci {
    public static int fibonacci(int n) {
        // Base case: Fibonacci of 0 and 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int number = 6;
        System.out.println("Fibonacci of " + number + " is " + fibonacci(number));
    }
}