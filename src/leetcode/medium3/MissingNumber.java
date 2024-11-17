package leetcode.medium3;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber ans = new MissingNumber();
        System.out.println(ans.missingNumber0ms(new int[] {1,2}));
    }

    public int missingNumber(int[] nums) {
        int max = getMax(nums);
        int min = 0;
        Arrays.sort(nums);

        for (int num : nums) {
            if (num != min)
                return min;
            else
                min += 1;
        }
        return max + 1;
    }

    public int missingNumber0ms(int[] nums) {
        int expectedSum = 0;
        int realSum = 0;
        int n = nums.length;

        for(int i = 0; i <= n; i++) {
            expectedSum += i;
            if(i < n)
                realSum += nums[i];
        }
        return expectedSum - realSum;
    }

    public int getMax(int[] nums) {
        int max = -1;
        for (int num : nums) {
            if (num > max)
                max = num;
        }
        return max;
    }
}
