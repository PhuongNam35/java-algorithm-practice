package leetcode.medium1;

public class SortColors {
    public static void main(String[] args) {
    }

    // My solution 0ms
    public void sortColors(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] count = new int[3];
        for(int num : nums) {
            count[num] ++;
        }

        int i = 0;
        for(int j = 0; j < 3; j++) {
            while(count[j] > 0) {
                ans[i] = j;
                i ++;
                count[j] --;
            }
        }

        System.arraycopy(ans, 0, nums, 0, n);
    }

    //Another solution 0ms
    public void sortColors0ms(int[] nums) {
        int t = 0,k = nums.length - 1;
        for(int i = 0; i < nums.length; ) {
            if(nums[i] == 0 && i != t) {
                int temp = nums[t];
                nums[t] = nums[i];
                nums[i] = temp;
                t ++;
            } else if(k > i && nums[i] == 2) {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k --;
            } else {
                i ++;
            }
        }
    }
}
