package leetcode.easy1;

import java.io.FilterOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray {
    public static void main(String[] args) {
        RelativeSortArray testAns = new RelativeSortArray();
        System.out.println(Arrays.toString(testAns.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];

        for(int num : arr1) {
            count[num] ++;
        }

        int n = arr1.length;
        int[] ans = new int[n];
        int i = 0;
        for(int num : arr2) {
            while (count[num] > 0) {
                ans[i] = num;
                i ++;
                count[num] --;
            }
        }

        for(int j = 0; j < count.length; j ++) {
            while(count[j] > 0) {
                ans[i] = j;
                i ++;
                count[j] --;
            }
        }

        return ans;
    }
}
