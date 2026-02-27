/*
 * ============================================================
 *  Application Name : Palindrome Checker App
 *  Version          : 1.0.0
 *  Description      : Console-based application that checks
 *                     whether a given string is a palindrome.
 * ============================================================
 */

public class PalindromeChecker {

    // ------------------------------
    // Application Constants
    // ------------------------------
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "Version 1.0.0";
    private static final String DEVELOPER = "Developed for Academic Learning";

    // -----------------------------------------------------------
    // Main Method - Entry Point of Java Application
    // JVM invokes this method automatically.
    // -----------------------------------------------------------
    public static void main(String[] args) {

        // Step 1: Display Welcome Screen
        displayWelcomeMessage();

        // Step 2: Continue to next functionality
        // (Currently placeholder - will be implemented in UC2)
        System.out.println("\nApplication is ready for palindrome validation...\n");

        // Optional exit message
        System.out.println("Thank you for using " + APP_NAME + "!");
    }

    // -----------------------------------------------------------
    // Static Method: displayWelcomeMessage()
    // Displays application startup details.
    // Static because it is called inside main() which is static.
    // -----------------------------------------------------------
    public static void displayWelcomeMessage() {

        System.out.println("==================================================");
        System.out.println("            WELCOME TO THE APPLICATION            ");
        System.out.println("==================================================");
        System.out.println("Application Name : " + APP_NAME);
        System.out.println("Application Info : " + APP_VERSION);
        System.out.println(DEVELOPER);
        System.out.println("--------------------------------------------------");
        System.out.println("This application validates whether a given");
        System.out.println("string is a palindrome under different conditions.");
        System.out.println("==================================================");
    }
}
