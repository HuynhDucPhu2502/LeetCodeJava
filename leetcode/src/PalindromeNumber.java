/**
 * Admin 3/1/2026
 * Problem: Palindrome Number
 * Difficulty: Easy
 * Link: <a href="https://leetcode.com/problems/palindrome-number/">Click Me</a>
 **/
public class PalindromeNumber {

    // ==============================
    // SOLUTION #1
    // ==============================
    public static boolean solve_PalindromeNumber_first(int x) {
        String xStr = String.valueOf(x);

        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int fullLength = xStr.length();
        int halfLength = xStr.length() / 2;

        for (int i = 0; i < halfLength; i++) {
            Character leftChar = xStr.charAt(i);
            Character rightChar = xStr.charAt(fullLength - 1 - i);

            if (!leftChar.equals(rightChar))
                return false;
        }

        return true;
    }

    // ==============================
    // SOLUTION #2
    // ==============================
    public static boolean solve_PalindromeNumber_second(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reverseHalf = 0;
        while (reverseHalf < x) {
            reverseHalf = reverseHalf * 10 + x % 10;
            x /= 10;
        }

        return reverseHalf / 10 == x || reverseHalf == x;
    }


    public static void main(String[] args) {
//        int a = 121;
//        int a = 2442;
//        int a = 1234;
        int a = -10;

        System.out.println(solve_PalindromeNumber_second(a));
    }

}
