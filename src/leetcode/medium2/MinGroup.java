package leetcode.medium2;

import leetcode.easy1.MinLength;

import java.lang.management.MemoryNotificationInfo;
import java.util.Arrays;

public class MinGroup {
    public static void main(String[] args) {
        MinGroup ans = new MinGroup();
        System.out.println(ans.minGroup(new int[][] {{5,10}, {6,8}, {1,5}, {2,3}, {1,10}}));
    }

    public int minGroup(int[][] intervals) {
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int cnt = 0;
        int current = 0;
        for(int check : start) {
            if(check > end[current])
                current++;
            else
                cnt++;
        }
        return cnt;
    }
}
