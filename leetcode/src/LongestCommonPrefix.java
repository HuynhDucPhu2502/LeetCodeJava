/**
 * Admin 3/1/2026
 * Problem: Longest Common Prefix
 * Difficulty: Easy
 * Link: <a href="https://leetcode.com/problems/longest-common-prefix/">Click Me</a>
 **/
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String mainCompare = strs[0];

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < mainCompare.length(); i++) {

            for (String str : strs) {

                if (str.length() - 1 < i)
                    return prefix.toString();

                if (str.charAt(i) != mainCompare.charAt(i))
                    return prefix.toString();

            }

            prefix.append(mainCompare.charAt(i));
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
//        String[] strs = {"flower", "flow", "flight"};
        String[] strs = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(strs));
    }

}
