package leetcode.easy3;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge2(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int right = m + n - 1;
        int rightNums1 = m - 1;
        int rightNums2 = n - 1;

        while(rightNums2 >= 0) {
            if(rightNums1 >= 0 && nums1[rightNums1] > nums2[rightNums2]) {
                nums1[right] = nums1[rightNums1];
                rightNums1--;
            }
            else {
                nums1[right] = nums2[rightNums2];
                rightNums2--;
            }
            right--;
        }
    }
}
