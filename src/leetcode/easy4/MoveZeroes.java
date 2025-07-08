package leetcode.easy4;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes ans = new MoveZeroes();
        int[] nums = new int[] {0,1,0,3,2,0};
        ans.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[index] = temp;
                index++;
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int length = nums.length;
        int index = 0;
        for(int i = 0; i < length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        while(index < length) {
            nums[index] = 0;
            index++;
        }
    }
}
