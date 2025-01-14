package leetcode.easy2;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        SummaryRanges ans = new SummaryRanges();
        System.out.println(ans.summaryString(new int[] {0,1,2,4,5,7}));
    }

    public List<String> summaryString(int[] nums) {
        List<String> ans = new ArrayList<>();

        int length = nums.length;
        if(length == 0)
            return ans;

        int start = nums[0];

        for(int i = 1; i <= length; i++) {
            if(i == length || nums[i] != nums[i-1] + 1) {
                if (start == nums[i-1]) {
                    ans.add(String.valueOf(start));
                }
                else {
                    ans.add(start + "->" + nums[i-1]);
                }
                if (i < length)
                    start = nums[i];
            }
        }
        return ans;
    }

    public List<String> summaryString1(int[] nums) {
        List<String> ans = new ArrayList<>();

        int length = nums.length;
        int start;
        int i = 0;

        while (i < length) {
            start = nums[i];
            while(i < length - 1 && nums[i] == nums[i + 1] - 1) {
                i++;
            }
            if (nums[i] == start)
                ans.add(String.valueOf(start));
            else
                ans.add(start + "->" + nums[i]);

            i++;
        }
        return ans;
    }
}
