package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] newArray = {-1,0,1,2,-1,-4};
        ThreeSum testAnswer = new ThreeSum();
        System.out.println(testAnswer.threeSum(newArray));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        int j = 1;
        int k;

        for(k = j + 1; k < nums.length; k++) {
            System.out.println(k);
            int tempSum = nums[i] + nums[j];
            if(tempSum + nums[k] == 0) {
                List<Integer> element = Arrays.asList(nums[i], nums[j], nums[k]);
                result.add(element);
            }
            if(k == nums.length - 1 && j < nums.length - 2){
                i += 1;
                j += 1;
                k = j + 1;
            }
        }
        return result;
    }
}
