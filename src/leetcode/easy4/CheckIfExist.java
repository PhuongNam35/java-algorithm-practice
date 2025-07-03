package leetcode.easy4;

import java.util.HashSet;
import java.util.Set;

public class CheckIfExist {
    public static void main(String[] args) {
        CheckIfExist ans = new CheckIfExist();
        int[] arr = new int[] {2,2,5,11};
        System.out.println(ans.checkIfExist2(arr));
    }

    public boolean checkIfExist(int[] arr) {
        Set<Integer> check = new HashSet<>();
        for(int num : arr) {
            if(check.contains(num*2) || num % 2 == 0 && check.contains(num / 2)) {
                return true;
            }
            check.add(num);
        }
        return false;
    }

    public boolean checkIfExist2(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int index = i;
            if(isExisted(arr, arr[i], index))
                return true;
        }
        return false;
    }

    public boolean isExisted(int[] arr, int value, int index) {
        for(int i = 0; i < arr.length; i++) {
            if(i == index)
                continue;
            if(arr[i] * 2 == value)
                return true;
        }
        return false;
    }
}
