package leetcode.medium2;

import java.util.Arrays;

public class MaxWidthRamp {
    public static void main(String[] args) {
        MaxWidthRamp ans = new MaxWidthRamp();
        System.out.println(ans.maxWidthRampTimeExceed(new int[] {1,2,1}));
    }

    public int maxWidthRampTimeExceed(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = nums.length - 1; j > i; j--) {
                if(nums[i] <= nums[j]) {
                    ans = Math.max(ans, j - i);
                    break;
                }
            }
        }

        return ans;
    }

    public int maxWidthRamp1ms(int[] nums) {
        int low = 1, high = nums.length-1, res = 0;

        while(low <= high) {
            int mid = low + (high - low)/2;
            if(possible(nums, mid)) {
                res = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return res;
    }

    private boolean possible(int[] nums, int width) {
        int i=0,j=width;
        int min = nums[i];
        while(j < nums.length) {
            if(nums[j] >= min) return true;
            j++;
            min = Math.min(min, nums[++i]);
        }
        return false;
    }
}
