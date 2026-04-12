/**
 * Admin 3/3/2026
 * Problem: Remove Element
 * Difficulty: Easy
 * Link: <a href="https://leetcode.com/problems/remove-element/">Click Me</a>
 **/
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; ++i) {

            if (nums[i] != val) {
                nums[k++] = nums[i];
            }

        }

        return k;
    }

    public static void main(String[] args) {
//        int[] k1 = {3, 2, 2, 3};
//        int val1 = 3;

        int[] k2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;

        System.out.println(removeElement(k2, val2));

    }

}
