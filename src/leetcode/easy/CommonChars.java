package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class CommonChars {
    public static void main(String[] args) {
        CommonChars testAns = new CommonChars();
        System.out.println(testAns.commonChars(new String[]{"cool","lock","cook"}));
    }

    public List<String> commonChars(String[] words) {
        List<String> answer = new ArrayList<>();
        int[] minArr = new int[26];

        for(int i = 0; i < 26; i++) {
            minArr[i] = Integer.MAX_VALUE;
        }

        for(String word : words) {
            int[] check = new int[26];
            for (char c : word.toCharArray()) {
                check[c - 'a'] ++;
            }
            for(int i = 0; i < 26; i++) {
                minArr[i] = Math.min(check[i], minArr[i]);
            }
        }

        for(int i = 0; i < 26; i ++) {
            for(int j = 0; j < minArr[i]; j++) {
                answer.add(Character.toString((char) 97 + i));
            }
        }

        return answer;
    }
}
