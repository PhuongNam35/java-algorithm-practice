package leetcode.hard1;

import java.util.Arrays;

public class ShortestPalindrome {
    public static void main(String[] args) {
        ShortestPalindrome ans = new ShortestPalindrome();
        System.out.println(Arrays.toString(ans.computeLongestPalindrome("aacecaaa")));
    }

//    public String shortestPalindrome(String s) {
//        int n = s.length();
//
//        if (n == 0)
//            return s;
//
//        String rev = new StringBuilder(s).reverse().toString();
//        String combined = s + " " + rev;
//    }

    public int[] computeLongestPalindrome(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int k = 0;
        int i = 1;

        while(i < n) {
            if(s.charAt(i) == s.charAt(k)) {
                k ++;
                lps[i] = k;
                i ++;
            }
            else {
                if (k != 0)
                    k = lps[k - 1];
                else {
                    lps[i] = 0;
                    i ++;
                }
            }
        }
        return lps;
    }
}
