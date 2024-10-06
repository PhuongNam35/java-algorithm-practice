package leetcode.easy1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayRankTransform {
    public static void main(String[] args) {
        ArrayRankTransform ans = new ArrayRankTransform();
        System.out.println(Arrays.toString(ans.arrayRankTransform(new int[] {40,10,20,30})));
    }

    public int[] arrayRankTransform(int[] arr) {
        arr = Arrays.stream(arr).sorted().toArray();
        int[] ans = new int[arr.length];
        int j = 1;
        for(int i = 0; i < arr.length; i++){
            if (i == 0) {
                ans[i] = j;
            }
            else if(arr[i] == arr[i-1])
                ans[i] = j;
            else
                ans[i] = ++j;
        }
        return ans;
    }
}
