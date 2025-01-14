package leetcode.easy2;

public class ClimbStairs {
    public static void main(String[] args) {
        ClimbStairs ans = new ClimbStairs();
        System.out.println(ans.climbStairs(6));
    }

    public int climbStairs(int n) {
        if(n == 0 || n == 1)
            return 1;

        int index1 = 1, index2 = 1;

        for(int i = 2; i <= n; i++) {
            int temp = index2;
            index2 += index1;
            index1 = temp;
        }
        return index2;
    }
}
