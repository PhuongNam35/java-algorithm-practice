package leetcode.medium2;

public class LongestDiverseString {
    public static void main(String[] args) {
        LongestDiverseString ans = new LongestDiverseString();
        System.out.println(ans.longestDiverseString(1, 1, 7));
    }

    public String longestDiverseString(int a, int b, int c) {
        StringBuilder ans = new StringBuilder();
        int curA = 0, curB = 0, curC = 0;
        int maxLen = a + b + c, i = 0;

        while(i < maxLen) {
            if(curA != 2 && a >= b && a >= c || a > 0 && (curB == 2 || curC == 2)) {
                ans.append("a");
                curA ++;
                curB = 0;
                curC = 0;
                a --;
            }
            else if(curB != 2 && b >=a && b >= c || b > 0 && (curA == 2 || curC == 2)) {
                ans.append("b");
                curB ++;
                curA = 0;
                curC = 0;
                b --;
            }
            else if(curC != 2 && c >=a && c >= b || c > 0 && (curA == 2 || curB == 2)) {
                ans.append("c");
                curC ++;
                curA = 0;
                curB = 0;
                c --;
            }
            i++;
        }
        return ans.toString();
    }
}
