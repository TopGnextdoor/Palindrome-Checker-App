import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        System.out.println("=======================================");
        System.out.println("   PALINDROME PERFORMANCE COMPARISON   ");
        System.out.println("=======================================");

        long start, end;

        start = System.nanoTime();
        boolean result1 = reverseStringCheck(input);
        end = System.nanoTime();
        long timeReverse = end - start;

        start = System.nanoTime();
        boolean result2 = stackCheck(input);
        end = System.nanoTime();
        long timeStack = end - start;

        start = System.nanoTime();
        boolean result3 = dequeCheck(input);
        end = System.nanoTime();
        long timeDeque = end - start;

        System.out.println("Reverse String Method  : " + result1 + " | Time: " + timeReverse + " ns");
        System.out.println("Stack Method           : " + result2 + " | Time: " + timeStack + " ns");
        System.out.println("Deque Method           : " + result3 + " | Time: " + timeDeque + " ns");

        System.out.println("=======================================");
        System.out.println("Program Execution Completed.");
    }

    public static String normalize(String input) {
        return input.replaceAll("\\s+", "").toLowerCase();
    }

    public static boolean reverseStringCheck(String input) {

        String normalized = normalize(input);
        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        return normalized.equals(reversed);
    }

    public static boolean stackCheck(String input) {

        String normalized = normalize(input);
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

    public static boolean dequeCheck(String input) {

        String normalized = normalize(input);
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < normalized.length(); i++) {
            deque.addLast(normalized.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}
