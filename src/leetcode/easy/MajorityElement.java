package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.sort;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arrayInput= {2,2,1,1,1,2,2};
        MajorityElement testAnswer = new MajorityElement();
        System.out.println(testAnswer.majorityElement2(arrayInput));;
    }

    public int majorityElementPN(int[] nums) {

        Map<Integer, Integer> containMap = new HashMap<>();
        int appearTimes = nums.length / 2;

        for(int num : nums) {
            if(containMap.containsKey(num)) {
                int count = containMap.get(num);
                containMap.put(num, count + 1);
            }
            else
                containMap.put(num, 1);
        }

        for(Map.Entry<Integer, Integer> entry : containMap.entrySet()) {
            int value = entry.getValue();
            if(value > appearTimes)
                return entry.getKey();
        }
        return 0;
    }

    public int majorityElement1(int[] nums) {
        int appear = nums.length / 2;
        sort(nums);
        return nums[appear];
    }

    public int majorityElement2(int[] nums) {

        Map<Integer, Integer> containMap = new HashMap<>();

        for (int num : nums) {
            containMap.put(num, containMap.getOrDefault(num, 0) + 1);
        }

        int appearance = nums.length / 2;
        for(Map.Entry<Integer, Integer> map : containMap.entrySet()) {
            if(map.getValue() > appearance) {
                return map.getKey();
            }
        }

        return 0;
    }
}
