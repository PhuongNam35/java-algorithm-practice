package leetcode.easy3;

import java.util.Arrays;

public class DuplicateZeros_01 {
    public static void main(String[] args) {
        int[] arr = new int[] {0,0,0,0,0,0,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void duplicateZeros(int[] arr) {
        int zeroCount = 0;
        int length = arr.length - 1;

        for(int i = 0; i <= length - zeroCount; i++) {
            if(arr[i] == 0) {
                if(i == length - zeroCount) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                zeroCount++;
            }
        }

        int newLength = length - zeroCount;
        for(int i = newLength; i >= 0; i--) {
            if(arr[i] == 0) {
                arr[i + zeroCount] = 0;
                zeroCount--;
                arr[i + zeroCount] = 0;
            }
            else {
                arr[i + zeroCount] = arr[i];
            }
        }
    }
}
