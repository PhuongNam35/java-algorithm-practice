package hackerrank.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {
    public static void main(String[] args) {
        CompareTriplets ans = new CompareTriplets();
        List<Integer> a = Arrays.asList(5,9,14);
        List<Integer> b = Arrays.asList(5,9,14);
        System.out.println(ans.compareTriplets(a, b));
    }

    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int n = a.size();
        int aPoint = 0, bPoint = 0;
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(a.get(i) > b.get(i))
                aPoint++;
            if(a.get(i) < b.get(i))
                bPoint++;
        }

        result.add(aPoint);
        result.add(bPoint);

        return result;
    }
}
