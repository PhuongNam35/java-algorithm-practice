package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        LengthOfLongestSubstring testAnswer = new LengthOfLongestSubstring();
        System.out.println(testAnswer.lengthOfLongestSubstring("dvdef"));
    }

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Set<Character> charSet = new HashSet<>();

        for(int i = 0; i < s.length(); i++) {
            if(!charSet.contains(s.charAt(i))) {
                charSet.add(s.charAt(i));
                maxLength = Math.max(maxLength, i - left + 1);
            }
            else {
                while(charSet.contains(s.charAt(i))) {
                    charSet.remove(s.charAt(left));
                    left ++;
                }
            }
            charSet.add(s.charAt(i));
        }
        return maxLength;
    }
}
