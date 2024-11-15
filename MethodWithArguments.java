public class MethodWithArguments {
    
    // Method that takes an argument and prints a message
    public static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        // Calling the method greetPerson with a string argument
        greetPerson("Alice");
        greetPerson("Bob");
    }
}