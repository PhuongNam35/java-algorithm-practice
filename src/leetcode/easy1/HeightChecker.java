package leetcode.easy1;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        HeightChecker testAns = new HeightChecker();
        System.out.println(testAns.heightChecker1ms(new int[] {1,2,3,4,5}));
    }

    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] newHeights = new int[n];
        System.arraycopy(heights, 0, newHeights, 0, heights.length);
        Arrays.sort(heights);

        int count = 0;
        for(int i = 0; i < n; i++) {
            if(heights[i] != newHeights[i]) count ++;
        }

        return count;
    }

    public int heightChecker1ms(int[] heights) {
        int heightsFreq[] = new int[101];
        int expected[] = new int[heights.length];
        for (int index =0; index < heights.length; index++) {
            heightsFreq[heights[index]]++;
        }
        int count =0, diffCount =0;
        for (int index =0; index < heightsFreq.length && count < heights.length;index++) {
            while (heightsFreq[index] > 0) {
                expected[count++] = index;
                heightsFreq[index]--;
            }
        }
        for (int index =0; index < heights.length; index++) {
            if(heights[index] != expected[index]) {
                diffCount++;
            }
        }
        return diffCount;
    }
}
