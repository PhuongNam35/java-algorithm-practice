package leetcode.easy2;

public class SearchInsert {
    public static void main(String[] args) {
        SearchInsert ans = new SearchInsert();
        System.out.println(ans.searchInsert(new int[] {1,3,5,6,9}, 2));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int check = left + (right - left) / 2;
            if(nums[check] == target)
                return check;
            else if(nums[check] < target) {
                left = check + 1;
            }
            else if(nums[check] > target) {
                right = check - 1;
            }
        }
        return left;
    }
}
