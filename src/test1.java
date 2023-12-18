package src;

/**
 * The Test1 class is a simple demonstration of printing goodbye messages in different languages.
 */
public class test1 {
    private static final String MESSAGE = "안녕하세요";
    private static final String GOODBYE_MESSAGE = "안녕히가세요";
    private static final String ENGLISH_GOODBYE_MESSAGE = "Goodbye";

    public static void main(String[] args) {
        System.out.println(MESSAGE);
        goodbyeFunction();
        englishGoodbyeFunction();
    }

    /**
     * Prints a goodbye message along with some additional farewell phrases.
     */
    public static void goodbyeFunction() {
        System.out.println(GOODBYE_MESSAGE);
        System.out.println("Goodbye!");
        System.out.println("Have a nice day!");
        System.out.println("See you later!");
    }

    /**
     * Prints a goodbye message in English
     */
    public static void englishGoodbyeFunction() {
        System.out.println(ENGLISH_GOODBYE_MESSAGE);
    }
}

/**
 * The `java` class is a simple class that serves as an entry point for a Java application.
 * It contains a single method, `main`, which is the starting point of execution for the program.
 */
class java {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

/**
 * The goodbye class contains a single method for printing a Korean goodbye message.
 *
 * <p>
 * Example usage:
 * <pre>{@code
 * goodbye.koreanGoodByeFunction();
 * }</pre>
 *
 * <p>
 * Note: This class does not have any instance variables or constructors, and all methods are static.
 */
class goodbye {
    public static void koreanGoodByeFunction() {
        System.out.println();
    }
}

/**
 * The HelloWorld class is a simple class that prints "Hello, world!" to the console.
 */
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

/**
 * The `Glasses` class represents a pair of glasses.
 */
class glasses {
    // This is a comment
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
    //create method to print age
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}


