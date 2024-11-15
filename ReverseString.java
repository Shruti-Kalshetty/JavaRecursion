public class ReverseString {
    public static String reverse(String str) {
        // Base case: empty string or single character
        if (str.isEmpty()) {
            return str;
        }
        // Recursive case: reverse the substring and add the first character to the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Reversed string: " + reverse(input));
    }
}