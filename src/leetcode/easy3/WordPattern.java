package leetcode.easy3;

public class WordPattern {
    public static void main(String[] args) {
        WordPattern ans = new WordPattern();
        System.out.println(ans.wordPattern("abba", "dog cat cat dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        char[] newPattern = pattern.toCharArray();
        String[] newS = s.split(" ");

        for(int i = 1; i < pattern.length(); i++) {
            if(newPattern[i] != newPattern[i-1] && newS[i].equals(newS[i-1]))
                return false;
            else if(newPattern[i] == newPattern[i-1] && !newS[i].equals(newS[i-1]))
                return false;
        }
        return true;
    }
}
