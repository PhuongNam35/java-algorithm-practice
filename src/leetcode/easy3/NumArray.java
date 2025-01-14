package leetcode.easy3;

import java.lang.reflect.Array;

public class NumArray {
    public static void main(String[] args) {
        System.out.println();
    }

    int[] calculatedNums;
    public NumArray(int[] nums) {
        calculatedNums = nums;
        for(int i = 1; i < nums.length; i++) {
            calculatedNums[i] += nums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        if(left == 0)
            return calculatedNums[right];
        else {
            return calculatedNums[right] - calculatedNums[left - 1];
        }
    }
}
