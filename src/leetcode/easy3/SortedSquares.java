package leetcode.easy3;

import java.util.Arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int[] nums2 = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums2);

        return nums2;
    }

    public int[] sortedSquares0ms(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int sLeft, sRight;
        int[] result = new int[n];

        for(int i = n - 1; i >= 0; i--) {
            sLeft = nums[left] * nums[left];
            sRight = nums[right] * nums[right];

            if(sLeft > sRight) {
                result[i] = sLeft;
                left ++;
            }
            else {
                result[i] = sRight;
                right --;
            }
        }
        return result;
    }
}
