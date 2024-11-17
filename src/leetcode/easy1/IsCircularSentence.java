package leetcode.easy1;

public class IsCircularSentence {
    public static void main(String[] args) {
        IsCircularSentence ans = new IsCircularSentence();
        System.out.println(ans.isCircularSentence("leetcode exercises sound delightfuL "));
        System.out.println(ans.check("ab cd "));
    }

    public int check(String s) {
        int ans = s.indexOf(" ", 3);

        return ans;
    }

    public boolean isCircularSentence(String sentence) {
        int n = sentence.length();
        if(sentence.charAt(0) != sentence.charAt(n - 1))
            return false;
        for(int i = 1; i < n - 1; i++) {
            if(Character.isWhitespace(sentence.charAt(i))) {
                if(sentence.charAt(i - 1) != sentence.charAt(i + 1))
                    return false;
            }
        }

        return true;
    }
    public boolean isCircularSentence0ms(String s) {
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;

        int k = s.indexOf(" ");
        if (k == -1)
            return true;

        while (k != -1) {
            if (s.charAt(k - 1) != s.charAt(k + 1)) {
                return false;
            }

            k = s.indexOf(" ", k+1);
        }
        return true;
    }
}
