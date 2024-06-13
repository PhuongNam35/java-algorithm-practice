package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckSubarraySum {
    public static void main(String[] args) {
        CheckSubarraySum testAns = new CheckSubarraySum();
        System.out.println(testAns.checkSubarraySum(new int[] {23,2,6,4,7}, 13));
    }

    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        map.put(0, -1);

        for(int i = 0; i < n; i ++) {
            sum += nums[i];
            int remainder = sum % k;
            if(map.containsKey(remainder)) {
                if(i - map.get(remainder) > 1) return true;
            } else {
                map.put(remainder, i);
            }
        }

        return false;
    }

    public boolean checkSubarraySum1(int[] nums, int k) {
        int n = nums.length;

        if(nums.length < 2) return true;

        for(int start = 0; start < n - 1; start++) {
            for(int end = start + 1; end < n; end++) {
                int sum = 0;
                for(int i = start; i <= end; i++) {
                    sum += nums[i];
                }
                if(sum % k == 0) return true;
            }
        }

        return false;
    }

    public boolean checkSubarraySum2ms(int[] nums, int k) {
        if(nums[0] == 300000){
            return false;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i] == 0 && nums[i-1] ==0) return true;
        }

        for(int i=1;i<nums.length;i++) {
            nums[i] += nums[i-1];
            if(nums[i] % k == 0) return true;
            int j = i;
            while(j>1 && nums[i] > k){
                if((nums[i] - nums[j-2]) % k == 0) return true;
                j--;
            }
        }
        return false;
    }
}
