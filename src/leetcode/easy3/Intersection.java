package leetcode.easy3;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        Intersection ans = new Intersection();
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        System.out.println(Arrays.toString(ans.intersection0ms(nums1, nums2)));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(int num : nums1) {
            map.put(num, 1);
        }

        for(int num : nums2) {
            if(map.containsKey(num)) {
                ans.add(num);
                map.remove(num);
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] intersection0ms(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        for(int num : nums1) {
            temp[num] = 1;
        }

        int count = 0;
        for(int num : nums2) {
            if(temp[num] == 1){
                temp[num] ++;
                count ++;
            }
        }

        int[] ans = new int[count];
        int index = 0;
        for(int num : temp) {
            if(num >= 2) {
                ans[index] = num;
                index ++;
            }
        }

        return ans;
    }
}
