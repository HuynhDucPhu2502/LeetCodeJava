import java.util.Arrays;

/**
 * Admin 3/3/2026
 * Problem: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Link: <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">Click Me</a>
 **/
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates_first(int[] nums) {
        int[] sortedNumbs = new int[nums.length];

        int index = 0;

        for (int y : nums) {
            if (index == 0 || sortedNumbs[index - 1] != y) {
                sortedNumbs[index++] = y;
            }
        }

        int k = index;

        Arrays.fill(sortedNumbs, index, sortedNumbs.length, 0);
        index = 0;

        for (int copy : sortedNumbs) {
            nums[index++] = copy;
        }

        return k;
    }

    public static int removeDuplicates_second(int[] nums) {
        if (nums.length == 0) return 0;

        int unique = 0;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != nums[unique - 1]) {
                nums[unique++] = nums[i];
            }
        }

        Arrays.fill(nums, unique, nums.length, 0);

        return unique;
    }

    public static void main(String[] args) {
        int[] k1 = {1, 1, 2};
//        int[] k2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates_first(k1));
    }

}
