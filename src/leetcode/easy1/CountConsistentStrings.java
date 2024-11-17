package leetcode.easy1;

public class CountConsistentStrings {
    public static void main(String[] args) {
        CountConsistentStrings ans = new CountConsistentStrings();
        System.out.println(ans.countConsistentStrings("cad", new String[] {"cc","acd","b","ba","bac","bad","ac","d"}));
        System.out.println(ans.test("c"));
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            int j = 0;
            boolean isConsistent = true;
            while(j < words[i].length()) {
                if(!allowed.contains(String.valueOf(words[i].charAt(j)))) {
                    isConsistent = false;
                }
                if(!isConsistent) {
                    count++;
                    break;
                }
                j++;
            }
        }
        return words.length - count;
    }

    public int test(String str) {
        return str.charAt(0) - 'a';
    }

//    public int countConsistentStrings2(String allowed, String[] words) {
//        boolean[] present = new boolean[26];
//        for(char c : allowed.toCharArray()) {
//            present[c - 'a'] = true;
//        }
//    }
//
//    boolean check(String str, boolean[] present) {
//        for(char c : str.toCharArray()) {
//            if()
//        }
//    }
}
