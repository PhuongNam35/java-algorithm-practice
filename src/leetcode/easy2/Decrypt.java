package leetcode.easy2;

import java.util.Arrays;

public class Decrypt {
    public static void main(String[] args) {
        Decrypt ans = new Decrypt();
        System.out.println(Arrays.toString(ans.decrypt(new int[]{5, 7, 1, 4}, 3)));
    }

    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if(k == 0)
            return result;

        int left = 0, sum =0;
        for(int right = 0; right < n + Math.abs(k); right++) {
            sum += code[right % n];

            if(right - left + 1 > Math.abs(k)) {
                sum -= code[left % n];
                left = (left + 1) % n;
            }

            if(right - left + 1 == Math.abs(k)) {
                if(k > 0)
                    result[(left - 1 + n) % n] = sum;
                else
                    result[(right + 1) % n] = sum;
            }
        }

        return result;
    }

    public int[] decrypt0ms(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if(k == 0) return result;

        int start = 1, end = k, sum = 0;
        if(k < 0) {
            start = n - Math.abs(k);
            end = n - 1;
        }

        for(int i = start; i <=end; i++)
            sum += code[i];

        for(int i = 0; i < n; i++) {
            result[i] = sum;
            sum -= code[start % n];
            sum += code[(end + 1) % n];
            start++;
            end++;
        }

        return result;
    }
}
