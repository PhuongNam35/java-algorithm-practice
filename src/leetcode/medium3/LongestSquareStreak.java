package leetcode.medium3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSquareStreak {
    public static void main(String[] args) {
        LongestSquareStreak ans = new LongestSquareStreak();
        System.out.println(ans.longestSquareStreak(new int[] {2,3,5,6,7}));
    }

    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);        Map<Integer, Integer> map = new HashMap<>();
        int ans = -1;

        for(int num : nums) {
            if(!map.containsKey(num)) {
                map.put(num*num, 1);
            }
            else {
                map.put(num*num, map.get(num) + 1);
                ans = Math.max(ans, map.get(num*num));
            }
        }

        return ans;
    }
}
