package leetcode.medium3;

import java.util.Arrays;

public class MinEnd {
    public static void main(String[] args) {
        MinEnd ans = new MinEnd();
        System.out.println(ans.minEnd(3, 4));
        System.out.println(Arrays.toString(ans.minEnd1(3, 4)));
    }

    public long minEnd(int n, int x) {
        long result = x;
        long remain = n - 1;
        long position = 1;

        while(remain != 0) {
            if((x & position) == 0) {
                result |= (remain & 1) * position;
                remain >>= 1;
            }
            position <<= 1;
        }
        return result;
    }

    public long[] minEnd1(int n, int x) {
        long[] ans = new long[n];
        ans[0] = x;
        for(int i = 1; i < n; i++) {
            int check = 1;
            while((x & (i << check)) == 0) {
                check ++;
            }
            ans[i] = (x & ((long) i << check - 1));
        }
//        Arrays.sort(ans);
        return ans;
    }
}
