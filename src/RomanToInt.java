/**
 * Admin 2/28/2026
 * Problem: Roman To Integer
 * Difficulty: Easy
 * Link: <a href="https://leetcode.com/problems/roman-to-integer/">Click Me</a>
 **/
public class RomanToInt {


    public static int parseNumber(char c) {

        switch (c) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
            default -> {
                return 0;
            }
        }

    }


    public static int romanToInt_first(String s) {

        int total = 0;
        int length = s.length();
        total += parseNumber(s.charAt(length - 1));

        for (int i = 0; i < length - 1; i++) {

            int firstNumb = parseNumber(s.charAt(i));

            if (i < s.length() - 1) {
                int secondNumb = parseNumber(s.charAt(i + 1));
                if (secondNumb > firstNumb)
                    total -= firstNumb;
                else total += firstNumb;
            } else total += firstNumb;
        }

        return total;
    }

    public static void main(String[] args) {

        String s = "MCMXCIV";
//        String s = "LVIII";
//        String s = "III";

        System.out.println(romanToInt_first(s));

    }

}
