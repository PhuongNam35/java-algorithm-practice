package leetcode.medium1;

import leetcode.easy1.MinMovesToSeat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinIncrementForUnique {
    public static void main(String[] args) {
        MinIncrementForUnique testAns = new MinIncrementForUnique();
        System.out.println(testAns.minIncrementForUnique(new int[] {3,2,1,2,1,7}));
    }

    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, ans = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                ans += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return ans;
    }
}
