package leetcode.easy2;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber ans = new SingleNumber();
        System.out.println(ans.singleNumber1(new int[] {4,1,2,1,2}));
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1)
                return entry.getKey();
        }

        return -1;
    }

    public int singleNumber1(int[] nums) {
        int sum = 0;
        for(int num : nums)
            return sum ^= num;

        return sum;
    }
}
