package leetcode.medium;

public class SubarrayDivByK {
    public static void main(String[] args) {

    }

    public int subarrayDivByK(int[] nums, int k) {
        int count = 0, n = nums.length;

        for(int num : nums) {
            if (num == 0 || num % k == 0) count++;
        }

        for(int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
            if(nums[i] % k == 0) count ++;
        }

        return count;
    }
}
