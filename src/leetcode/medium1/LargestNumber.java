package leetcode.medium1;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        LargestNumber ans = new LargestNumber();
        System.out.println(ans.largestNUmber(new int[] {3,30,34,5,9}));
    }

    public String largestNUmber(int[] nums) {
        String[] array = new String[nums.length];

        for(int i = 0; i < nums.length; i++) {
            array[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(array, (a, b) -> (b + a).compareTo(a + b));
        if(array[0].equals("0"))
            return "0";

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }

        return sb.toString();
    }
}
