package leetcode.easy3;

public class FindNumbers {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int num : nums) {
            int tempCount = 1;
            while(num/10 > 0) {
                tempCount ++;
                num /= 10;
            }
            if(tempCount % 2 == 0)
                ans++;
        }

        return ans;
    }
}
