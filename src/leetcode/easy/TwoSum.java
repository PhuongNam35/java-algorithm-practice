package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result2 = twoSum.twoSum2(nums, target);
        int[] result1 = twoSum.twoSum1(nums, target);
        System.out.println(result1[0] + " " + result1[1]);
        System.out.println(result2[0] + " " + result2[1]);
    }

    public int[] twoSum1(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int nums[], int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}

