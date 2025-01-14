package leetcode.easy2;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros ans = new MoveZeros();
        int[] array = {1,2};
        ans.moveZeros(array);
        System.out.println(Arrays.toString(array));
    }

    public void moveZeros(int[] nums) {
        int n = nums.length;
        int left = 0;

        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
