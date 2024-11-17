package leetcode.easy1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ArrayRankTransform {
    public static void main(String[] args) {
        ArrayRankTransform ans = new ArrayRankTransform();
        System.out.println(Arrays.toString(ans.arrayRankTransform(new int[]{40, 10, 20, 20, 20, 30})));
    }

    public int[] arrayRankTransform(int[] arr) {
        TreeSet<Integer> tempContain = new TreeSet<>();
        for (int num : arr)
            tempContain.add(num);

        Map<Integer, Integer> countContain = new HashMap<>();
        int cnt = 1;
        for (int num : tempContain)
            countContain.put(num, cnt++);

        int n = arr.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = countContain.get(arr[i]);
        }

        return ans;
    }
}
