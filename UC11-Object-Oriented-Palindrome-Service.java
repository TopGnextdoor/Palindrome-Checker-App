import java.util.Stack;

class PalindromeService {

    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "Madam";

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP         ");
        System.out.println("=======================================");
        System.out.println("Input String : " + input);

        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("Result : The string is a PALINDROME.");
        } else {
            System.out.println("Result : The string is NOT a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program Execution Completed.");
    }
}
