package leetcode.medium2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MaximumSwap {
    public static void main(String[] args) {
        MaximumSwap ans = new MaximumSwap();
        System.out.println(ans.maximumSwap2(9973));
    }

    public int maximumSwap(int num) {
        int ans = num;
        ArrayList<Integer> contain = new ArrayList<>();

        while(num > 0) {
            contain.add(num % 10);
            num /= 10;
        }

        for(int i = contain.size() - 1; i >= 0; i --) {
            for(int j = i - 1; j >= 0; j --) {
                if(contain.get(j) > contain.get(i)) {
                    int temp = contain.get(j);
                    contain.set(j, contain.get(i));
                    contain.set(i, temp);
                    if(j > 0)
                        continue;
                }
                Collections.reverse(contain);
                int result = 0;
                for(int digit : contain) {
                    result = result * 10 + digit;
                }
                return result;
            }
        }
        return ans;
    }

    public int maximumSwap2(int num) {
        int ans = num;
        ArrayList<Integer> contain = new ArrayList<>();

        while(num > 0) {
            contain.add(num % 10);
            num /= 10;
        }

        for(int i = contain.size() - 1; i >= 0; i--) {
            int maxIndex = i;
            for(int j = i - 1; j >= 0; j--) {
                // If we find same max digit, take the rightmost one
                if(contain.get(j) >= contain.get(maxIndex)) {
                    maxIndex = j;
                }
            }
            if(maxIndex != i && contain.get(maxIndex) > contain.get(i)) {
                int temp = contain.get(i);
                contain.set(i, contain.get(maxIndex));
                contain.set(maxIndex, temp);

                int result = 0;
                for(int k = contain.size() - 1; k >= 0; k--) {
                    result = result * 10 + contain.get(k);
                }
                return result;
            }
        }

        return ans;
    }
}
