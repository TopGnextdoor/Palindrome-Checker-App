import java.util.Stack;

public class PalindromeChecker {

    public static void main(String[] args) {

        String original = "madam";

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP         ");
        System.out.println("=======================================");
        System.out.println("Original String : " + original);

        boolean isPalindrome = checkUsingStack(original);

        if (isPalindrome) {
            System.out.println("Result : The string is a PALINDROME.");
        } else {
            System.out.println("Result : The string is NOT a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program Execution Completed.");
    }

    public static boolean checkUsingStack(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
