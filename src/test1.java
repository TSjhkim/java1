package src;

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

class java {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

class goodbye {
    public static void koreanGoodByeFunction() {
        System.out.println();
    }
}

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}

