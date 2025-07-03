package leetcode.easy4;

public class ValidMountainArray {
    public static void main(String[] args) {
        ValidMountainArray ans = new ValidMountainArray();
        int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9};
        System.out.println(ans.validMountainArray(arr));
    }

    public boolean validMountainArray(int[] arr) {
        boolean checkPoint = false;
        if(arr.length < 3)
            return false;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1])
                return false;
            if(arr[i] < arr[i - 1] && !checkPoint) {
                checkPoint = true;
            }
            else if(arr[i] > arr[i - 1] && checkPoint)
                return false;
        }
        if(!checkPoint)
            return false;
        return true;
    }
}
