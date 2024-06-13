package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {0,1,1};
        System.out.println(containsDuplicate.containsDuplicate2(nums));
    }

    //Time complexity: O(n)
    public boolean containsDuplicate1(int[] nums) {
        int index = 0;
        int i = 1;
        if(nums.length == 1) return false;

        while(true) {
            if(nums[index] == nums[i]) {
                return true;
            }
            if(i == nums.length - 1) {
                index ++;
                i = index + 1;
                if(index == nums.length - 1) {
                    return false;
                }
                else continue;
            }
            i++;
        }
    }

    public boolean containsDuplicate2(int[] nums) {
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(seen.containsKey(nums[i])) {
                return true;
            }
            seen.put(nums[i], i);
        }
        return false;
    }
}
