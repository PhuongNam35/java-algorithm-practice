package leetcode.medium1;

import java.util.*;

public class SingleNumberIII {
    public static void main(String[] args) {
        SingleNumberIII testAns = new SingleNumberIII();
        System.out.println(Arrays.toString(testAns.singleNumberIII2(new int[]{-1,5})));
    }

    public int[] singleNumberIII(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        int i = 0;
        int n = 0;

        while(i < nums.length) {
            int j = i + 1;
            if(j == nums.length) {
                ans[n++] = nums[i];
                break;
            }

            if(nums[i] != nums[j] || j == nums.length - 1) {
                ans[n++] = nums[i];
                if(n==2) break;
                i++;
            } else {
                i += 2;
            }
        }

        return ans;
    }

    public int[] singleNumberIII2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        int[] result = new int[2];

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() == 1) {
                result[index ++] = entry.getKey();
            }
        }

        return result;
    }
}
