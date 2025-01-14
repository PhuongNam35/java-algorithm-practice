package hackerrank.warmup;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,1,0,-1,-1);
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int pos = 0, neg = 0, zer = 0;
        for(int i : arr) {
            if(i > 0)
                pos ++;
            else if (i < 0)
                neg ++;
            else
                zer ++;
        }
        System.out.println((double) pos/n);
        System.out.println((double) neg/n);
        System.out.println((double) zer/n);
    }
}
