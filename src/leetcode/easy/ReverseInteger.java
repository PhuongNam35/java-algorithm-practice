package leetcode.easy;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger testAnswer = new ReverseInteger();
        System.out.println(testAnswer.reverseInterger(-2147483648));
    }

    public int reverseInterger(int x) {
        int temp = 0;
        long testAns = 0;
        int ans = 0;
        while(x != 0) {
            temp = x % 10;
            testAns = testAns * 10 + temp;
            x /= 10;
        }
        if (testAns > 2147483647 || testAns < -2147483647)
            return 0;
        ans = (int) testAns;
        return ans;
    }
}
