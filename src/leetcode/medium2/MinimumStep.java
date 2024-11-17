package leetcode.medium2;

public class MinimumStep {
    public static void main(String[] args) {
        MinimumStep ans = new MinimumStep();
        System.out.println(ans.minimumStep("0100110"));
    }

    public long minimumStep(String s) {
        long swap = 0;
        int black = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0')
                swap += (long) black;
            else
                black ++;
        }

        return swap;
    }
}
