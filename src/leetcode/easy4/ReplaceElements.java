package leetcode.easy4;

import java.util.Arrays;

public class ReplaceElements {
    public static void main(String[] args) {
        ReplaceElements ans = new ReplaceElements();
        int[] arr = new int[] {17,18,5,4,6,1};
        System.out.println(Arrays.toString(ans.replaceElements(arr)));
    }

    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = arr[n-1];

        for(int i = n - 1; i >= 0; i--) {
            if(i == n-1)
                arr[i] = -1;
            else {
                int temp = max;
                if(arr[i] > max)
                    max = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
