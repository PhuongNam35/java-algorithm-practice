package leetcode.easy4;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates ans = new RemoveDuplicates();
        int[] array = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(ans.removeDuplicates(array));
        System.out.println(Arrays.toString(array));
    }

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int index = 1;
        int check = 1;

        while(index < length) {
            if(nums[index] == nums[index - 1]) {
                index ++;
                continue;
            }
            else {
                nums[check] = nums[index];
                check ++;
            }
            index ++;
        }
        return check;
    }
}
