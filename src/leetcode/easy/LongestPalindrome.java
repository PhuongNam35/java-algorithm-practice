package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome testAns = new LongestPalindrome();
        System.out.println(testAns.longestPalindrome2("abcccdd"));
    }

    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;

        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        boolean flag = true;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 == 0) {
                count += entry.getValue();
            }
            else if(entry.getValue() > 1 && flag) {
                count += entry.getValue();
                flag = false;
            }else if(entry.getValue() == 1 && flag) {
                count += 1;
                flag = false;
            } else {
                count += (entry.getValue() - 1);
            }
        }

        return count;
    }

    public int longestPalindrome1(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int count = 0;

        for(char c : s.toCharArray()) {
            if(charSet.contains(c)) {
                charSet.remove(c);
                count += 2;
            } else {
                charSet.add(c);
            }
        }

        if(!charSet.isEmpty()) count ++;

        return count;
    }

    public int longestPalindrome2(String s) {
        int[] arr = new int[58];
        int count = 0, odd = 0;

        for(char c : s.toCharArray()){
            arr[c - 'A'] ++;
        }

        for(int num : arr) {
            if(num % 2 == 0 && num != 0) {
                count += num;
            } else if(num % 2 == 1 && num != 1) {
                count += (num - 1);
                odd = 1;
            } else if(num == 1) {
                odd = 1;
            }
        }

        return count + odd;
    }
}
