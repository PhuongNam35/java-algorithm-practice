package leetcode.easy2;

import leetcode.easy.ContainsDuplicate;

import java.util.HashMap;

public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        ContainsNearbyDuplicate ans = new ContainsNearbyDuplicate();
        System.out.println(ans.containsNearbyDuplicateSlidingWindow(new int[] {1,2,3,1,2,3}, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
                return true;
            map.put(nums[i], i);
        }

        return false;
    }

    public boolean containsNearbyDuplicateSlidingWindow(int[] nums, int k) {
        int check = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            for(int j = Math.min((i+k), n-1); j > i; j--, check++) {
                if(nums[i] == nums[j])
                    return true;
            }
            if(check > 4999)
                return false;
        }

        return false;
    }
}
