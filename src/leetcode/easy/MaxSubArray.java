package leetcode.easy;

public class MaxSubArray {
    public static void main(String[] args) {
        MaxSubArray ans = new MaxSubArray();
        int[] nums = {-2,1,-2,3,-5,-1,2,1,-5,4};
        System.out.println(ans.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int tempSum = 0;

        for(int i = 0; i < nums.length; i++) {
            tempSum += nums[i];
            if(tempSum > maxSum) {
                maxSum = tempSum;
            }
            if(tempSum < 0) {
                tempSum = 0;
            }
        }
        return maxSum;
    }
}
