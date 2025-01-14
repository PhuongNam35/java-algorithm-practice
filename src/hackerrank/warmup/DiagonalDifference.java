package hackerrank.warmup;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(9,8,9)
        );
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int sumA = 0, sumB = 0;
        for(int i = 0 ; i < n; i++) {
            sumA += arr.get(i).get(i);
            sumB += arr.get(i).get(n - 1 - i);
        }
        return Math.abs(sumA - sumB);
    }
}
