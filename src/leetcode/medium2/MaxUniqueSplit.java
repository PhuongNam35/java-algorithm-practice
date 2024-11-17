package leetcode.medium2;

import java.util.Arrays;

public class MaxUniqueSplit {
    public static void main(String[] args) {
        MaxUniqueSplit ans = new MaxUniqueSplit();
        System.out.println(ans.maxUniqueSplit("aab"));
    }

    public int maxUniqueSplit(String s) {
        int n = s.length();
        String[] contain = new String[n];
        int i = 0;
        String charToStr = "";

        for(char c : s.toCharArray()) {
            charToStr = charToStr + c;
            if(!Arrays.asList(contain).contains(charToStr)) {
                contain[i] = charToStr;
                charToStr = "";
                i++;
            }
        }

        return contain.length;
    }
}
