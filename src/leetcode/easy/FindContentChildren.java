package leetcode.easy;

import java.util.Arrays;

public class FindContentChildren {
    public static void main(String[] args) {
        FindContentChildren testAnswer = new FindContentChildren();
        System.out.println(testAnswer.findContentChildren(new int[]{10,9,8,7}, new int[]{5,6,7,8}));

    }

    public int findContentChildren(int[] g, int[] s) {

        if(s.length == 0 || g.length == 0)
            return 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int j = 0;
        int i = 0;
        int count = 0;

        do {
            if (s[j] >= g[i]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        } while (i < g.length && j < s.length);

        return count;
    }
}
