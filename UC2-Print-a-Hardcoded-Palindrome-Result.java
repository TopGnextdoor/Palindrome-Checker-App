public class PalindromeChecker {
    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word = "madam";

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP         ");
        System.out.println("=======================================");
        System.out.println("Hardcoded Word : " + word);

        // Check if palindrome
        boolean isPalindrome = checkPalindrome(word);

        // Conditional Statement (if-else)
        if (isPalindrome) {
            System.out.println("Result : \"" + word + "\" is a PALINDROME.");
        } else {
            System.out.println("Result : \"" + word + "\" is NOT a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program Execution Completed.");
    }

    // -----------------------------------------------------------
    // Static Method to Check Palindrome
    // -----------------------------------------------------------
    public static boolean checkPalindrome(String input) {

        // Reverse the string manually
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
}
