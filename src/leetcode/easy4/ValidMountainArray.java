package leetcode.easy4;

public class ValidMountainArray {
    public static void main(String[] args) {
        ValidMountainArray ans = new ValidMountainArray();
        int[] arr = new int[] {2,3,2};
        System.out.println(ans.validMountainArray2(arr));
    }

    public boolean validMountainArray2(int[] arr) {
        if(arr.length < 3)
            return false;

        int i = 0;
        int n = arr.length;
        while(i + 1 < n && arr[i] < arr[i+1]) {
            i++;
        }
        if(i == n - 1 || i == 0)
            return false;
        while(i + 1 < n && arr[i] > arr[i + 1])
            i++;

        return i == n-1;
    }

    public boolean validMountainArray(int[] arr) {
        boolean upMountain = false;
        boolean downMoutain = false;
        boolean mountainPeek = false;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1])
                return false;
            if(arr[i] > arr[i-1] && !upMountain)
                upMountain = true;
            else if(arr[i] < arr[i-1] && !downMoutain)
                downMoutain = true;
            if(arr[i] < arr[i - 1] && !mountainPeek) {
                mountainPeek = true;
            }
            else if(arr[i] > arr[i - 1] && mountainPeek)
                return false;
        }
        if(!mountainPeek || (!downMoutain || !upMountain))
            return false;
        return true;
    }
}
