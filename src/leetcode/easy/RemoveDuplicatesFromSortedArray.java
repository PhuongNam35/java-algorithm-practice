package leetcode.easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray testAnswer = new RemoveDuplicatesFromSortedArray();
        System.out.println(testAnswer.removeDuplicates(new int[]{1, 1, 2}));

    }

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;

        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index ++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }
}
