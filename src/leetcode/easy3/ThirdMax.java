package leetcode.easy3;

import java.util.Arrays;

public class ThirdMax {
    public static void main(String[] args) {
        ThirdMax ans = new ThirdMax();
        System.out.println(ans.thirdMax0ms(new int[]{2,2,2,3,1}));
    }

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i <= (n - 1)/2; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }

        int maxNum = nums[0], preNum = nums[0];
        int cnt = 0;
        for(int i = 1; i < n; i++) {
            if(preNum != nums[i]) {
                cnt++;
                preNum = nums[i];
            }
            if(cnt == 2)
                return nums[i];
        }

        return maxNum;
    }

    public int thirdMax0ms(int[] nums) {
        long Max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int num : nums) {
            if(Max < num) {
                thirdMax = secondMax;
                secondMax = Max;
                Max = num;
            }
            else if(secondMax < num && num != Max) {
                thirdMax = secondMax;
                secondMax = num;
            }
            else if(thirdMax < num && num != secondMax && num != Max)
                thirdMax = num;
        }

        if(thirdMax == Long.MIN_VALUE)
            return (int)Max;

        return (int)thirdMax;
    }
}
