package leetcode.easy;

import java.util.Arrays;

public class SpecialArray {
    public static void main(String[] args) {
        SpecialArray testAnswer = new SpecialArray();
        System.out.println(testAnswer.specialArray(new int[]{0,0}));
    }

    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int temp = nums.length;
        int numPre = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= temp && numPre < temp) {
                return temp;
            } else {
                temp --;
            }
            numPre = nums[i];
        }
        return -1;
    }
}
