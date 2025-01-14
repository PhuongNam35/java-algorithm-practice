package leetcode.medium4;

import java.util.HashSet;
import java.util.Set;

public class CountPalindromicSubsequence {
    public int countPalindromicSubsequence(String s) {
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray())
            set.add(c);
        int ans = 0;
        for(char c : set) {
            int firstIndex = -1;
            int lastIndex = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == c) {
                    if(firstIndex == -1)
                        firstIndex = i;
                    lastIndex = i;
                }
            }

            Set<Character> set1 = new HashSet<>();
            for(int j = firstIndex + 1; j < lastIndex; j++) {
                set1.add(s.charAt(j));
            }
            ans += set1.size();
        }

        return ans;
    }
}
