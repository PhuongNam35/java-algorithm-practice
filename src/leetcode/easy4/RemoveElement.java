package leetcode.easy4;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = new int[]{3,2,2,3};
        RemoveElement ans = new RemoveElement();
        System.out.println(ans.removeElement(array, 3));
        System.out.println(Arrays.toString(array));
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[index] = nums[i];
                index ++;
            }
        }
        return index;
    }
}
