public class PalindromeChecker {

    public static void main(String[] args) {

        String original = "radar";

        System.out.println("=======================================");
        System.out.println("        PALINDROME CHECKER APP         ");
        System.out.println("=======================================");
        System.out.println("Original String : " + original);

        boolean isPalindrome = checkUsingCharArray(original);

        if (isPalindrome) {
            System.out.println("Result : The string is a PALINDROME.");
        } else {
            System.out.println("Result : The string is NOT a palindrome.");
        }

        System.out.println("=======================================");
        System.out.println("Program Execution Completed.");
    }

    public static boolean checkUsingCharArray(String input) {

        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {

            if (characters[start] != characters[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
