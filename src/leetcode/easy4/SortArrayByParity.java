package leetcode.easy4;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        SortArrayByParity ans = new SortArrayByParity();
        int[] nums = new int[] {1,6};
        System.out.println(Arrays.toString(ans.sortArrayByParity(nums)));
    }

    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        for(int num : nums) {
            if(num % 2 == 0) {
                ans[leftIndex] = num;
                leftIndex++;
            }
            else {
                ans[rightIndex] = num;
                rightIndex--;
            }
        }

        return ans;
    }
}
