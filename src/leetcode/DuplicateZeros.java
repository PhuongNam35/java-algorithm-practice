package leetcode;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        int[] result = duplicateZeros(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] duplicateZeros(int[] arr) {
        int cntZero = 0;
        for(int num : arr)
            if(num == 0)
                cntZero++;

        int[] newArr = new int[arr.length + cntZero];
        int supplement = 0;
        int index = 0;
        while(index < arr.length) {
            if(arr[index] != 0) {
                newArr[index + supplement] = arr[index];
            }
            else {
                newArr[index + supplement] = arr[index];
                supplement++;
                newArr[index + supplement] = arr[index];
            }
            index ++;
        }
        return newArr;
    }
}
