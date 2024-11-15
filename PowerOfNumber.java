public class PowerOfNumber {
    public static int power(int x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }
        // Recursive case
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int base = 2, exponent = 3;
        System.out.println(base + " raised to the power of " + exponent + " is " + power(base, exponent));
    }
}