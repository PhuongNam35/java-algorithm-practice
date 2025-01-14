package hackerrank.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AveryBigSum {
    public static void main(String[] args) {
        List<Long> a = Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);

        System.out.println(aVeryBigSum(a));
    }

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for(long i : ar) {
            sum += i;
        }

        return sum;
    }
}
