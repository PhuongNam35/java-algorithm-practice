package leetcode.easy;

public class ScoreOfString {
    public static void main(String[] args) {
        ScoreOfString testAns = new ScoreOfString();
        System.out.println(testAns.scoreOfString("za"));
    }

    public int scoreOfString(String s) {
        int n = s.length();
        int sum = 0;

        for(int i = 0; i < n - 1; i++){
            sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return sum;
    }
}
