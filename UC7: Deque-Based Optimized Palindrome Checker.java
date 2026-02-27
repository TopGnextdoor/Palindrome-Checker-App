import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeChecker {

    public static void main(String[] args) {

        String original = "racecar";

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP         ");
        System.out.println("=======================================");
        System.out.println("Original String : " + original);

        boolean isPalindrome = checkUsingDeque(original);

        if (isPalindrome) {
            System.out.println("Result : The string is a PALINDROME.");
        } else {
            System.out.println("Result : The string is NOT a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program Execution Completed.");
    }

    public static boolean checkUsingDeque(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}
