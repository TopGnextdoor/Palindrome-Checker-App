public class PalindromeChecker {

    public static void main(String[] args) {

        String original = "level";

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP         ");
        System.out.println("=======================================");
        System.out.println("Original String : " + original);

        String reversed = reverseString(original);

        System.out.println("Reversed String : " + reversed);

        if (original.equals(reversed)) {
            System.out.println("Result : The string is a PALINDROME.");
        } else {
            System.out.println("Result : The string is NOT a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program Execution Completed.");
    }

    public static String reverseString(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        return reversed;
    }
}
