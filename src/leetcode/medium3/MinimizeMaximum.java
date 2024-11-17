package leetcode.medium3;

public class MinimizeMaximum {
    public static void main(String[] args) {
        MinimizeMaximum ans = new MinimizeMaximum();
        System.out.println(ans.minimizeMaximum(6, new int[] {11,6}));
    }

    public int minimizeMaximum(int n, int[] quantities) {
        int left = 1, right = 100000;
        while(left <= right) {
            int mid = (right - left)/2 + left;
            if(check(n, quantities, mid))
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }

    public boolean check(int n, int[] quantities, int val) {
        int total = 0;
        for(int quantity : quantities)
            total += (quantity + val - 1)/val;
        return total <= n;
    }
}
