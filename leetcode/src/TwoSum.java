import java.util.HashMap;
import java.util.Map;

/**
 * Admin 2/28/2026
 * Problem: Two Sum
 * Difficulty: Easy
 * Link: <a href="https://leetcode.com/problems/two-sum/">Click Me</a>
 **/
public class TwoSum {

    // ==============================
    // SOLUTION #1
    // ==============================
    public static int[] solve_twoSum_first(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            int leftOver = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (leftOver == nums[j]) {
                    return new int[]{i, j};
                }
            }

        }

        return null;
    }

    // ==============================
    // SOLUTION #2
    // ==============================
    public static int[] solve_twoSum_second(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];
            Integer j = map.get(need);

            if (j != null) return new int[]{i, j};
            else map.put(nums[i], i);
        }

        return null;
    }


    public static void main(String[] args) {

//        int[] nums = new int[]{2, 7, 11, 5};
//        int target = 9;

//        int[] nums = new int[]{3, 2, 4};
//        int target = 6;

        int[] nums = new int[]{3, 3};
        int target = 6;

        int[] ts = solve_twoSum_second(nums, target);
        System.out.println(ts[0] + " " + ts[1]);

    }

}
