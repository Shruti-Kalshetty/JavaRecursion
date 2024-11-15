public class SumOfNaturalNumbers {
    public static int sum(int n) {
        // Base case: sum of numbers till 0 is 0
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Sum of natural numbers till " + number + " is " + sum(number));
    }
}