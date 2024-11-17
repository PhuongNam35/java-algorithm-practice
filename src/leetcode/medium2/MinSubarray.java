package leetcode.medium2;

import java.util.HashSet;
import java.util.Set;

public class MinSubarray {
    public static void main(String[] args) {
        MinSubarray ans = new MinSubarray();
        System.out.println(ans.minSubarray(new int[]{26,19,11,14,18,4,7,1,30,23,19,8,10,6,26,3}, 26));
    }

    public int minSubarray(int[] nums, int p) {
        long sum = 0;
        for(int i = 0; i < nums.length; i++)
            sum += nums[i];
        int ans = 0;
        if(sum % p == 0)
            return 0;
        if(sum < p)
            return -1;

        Set<Long> numSet = new HashSet<>();
        for (long num : nums)
            numSet.add(num);

        while(sum > p) {
            long sparse = sum % p;

            if(numSet.contains(sparse)) {
                numSet.remove(sparse);
                ans += 1;
                sum -= sparse;
                if(sum % p == 0) return ans;
                continue;
            }

            long remove = sum / sparse;

            if(numSet.contains(remove)) {
                numSet.remove(remove);
                ans += 1;
                sum -= remove;
                if(sum % p == 0) return ans;
            }

            else return -1;
        }
        return -1;
    }
}
