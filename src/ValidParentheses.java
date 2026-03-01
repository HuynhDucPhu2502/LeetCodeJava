import java.util.Stack;

/**
 * Admin 2/28/2026
 * Problem: Valid Parentheses
 * Difficulty: Easy
 * Link: <a href="https://leetcode.com/problems/valid-parentheses/">Click Me</a>
 **/
public class ValidParentheses {

//    public static boolean isValid(String s) {
//
//        boolean validParentheses = true;
//        boolean validCurlyBraces = true;
//        boolean validSquareBrackets = true;
//
//        for (int i = 0; i < s.length(); i++) {
//
//            switch (s.charAt(i)) {
//
//                case '(' -> {
//                    validParentheses = false;
//                }
//
//                case ')' -> {
//                    if (checkIsInsideOtherBrackets(i, '(', s)) return false;
//                    else if (!validParentheses) validParentheses = true;
//                    else return false;
//                }
//
//                case '{' -> {
//                    validCurlyBraces = false;
//                }
//
//                case '}' -> {
//                    if (checkIsInsideOtherBrackets(i, '{', s)) return false;
//                    else if (!validCurlyBraces) validCurlyBraces = true;
//                    else return false;
//                }
//
//                case '[' -> {
//                    validSquareBrackets = false;
//                }
//
//                case ']' -> {
//                    if (checkIsInsideOtherBrackets(i, '[', s)) return false;
//                    else if (!validSquareBrackets) validSquareBrackets = true;
//                    else return false;
//                }
//
//
//            }
//
//
//        }
//
//        return validParentheses && validSquareBrackets && validCurlyBraces;
//    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{')
                stack.push(c);

            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                else {
                    char top = stack.pop();

                    if (c == ')' && top != '(') return false;
                    else if (c == ']' && top != '[') return false;
                    else if (c == '}' && top != '{') return false;
                }
            }

        }

        return stack.isEmpty();
    }

//    public static boolean checkIsInsideOtherBrackets(int i, char charCheck, String s) {
//
//        if (i == 0 || i == s.length() - 1) return false;
//
//        Character charBehind = s.charAt(i - 1);
//
//        return !charBehind.equals(charCheck);
//    }


    public static void main(String[] args) {
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([)]")); // false
        System.out.println(isValid("([])")); // true
        System.out.println(isValid("([)]")); // false
        System.out.println(isValid("[[[]")); // false

    }

}
