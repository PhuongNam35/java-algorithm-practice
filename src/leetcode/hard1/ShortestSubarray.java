package leetcode.hard1;

import java.util.Deque;
import java.util.LinkedList;

public class ShortestSubarray {
    public static void main(String[] args) {
        ShortestSubarray ans = new ShortestSubarray();
        System.out.println(ans.shortestSubarray1(new int[] {2,-1,2}, 3));
    }

    public int shortestSubarrayTimeLimit(int[] nums, int k) {
        int n = nums.length;
        int minCnt = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            int sum = nums[i];
            if(sum >= k) {
                minCnt = Math.min(minCnt, 1);
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                sum += nums[j];
                if(sum >= k) {
                    minCnt = Math.min(minCnt, j - i + 1);
                    break;
                }
            }
        }

        return minCnt == Integer.MAX_VALUE ? -1 : minCnt;
    }

    public int shortestSubarray1(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n + 1];

        for(int i = 0; i < n; i++) {
            prefix[i + 1] = nums[i] + prefix[i];
        }

        Deque<Integer> deque = new LinkedList<>();
        int minLenght = Integer.MAX_VALUE;
        for(int i = 0; i <= n; i++) {
            while(!deque.isEmpty() && prefix[i] - prefix[deque.peekFirst()] >= k) {
                minLenght = Math.min(minLenght, i - deque.pollFirst());
            }

            deque.addLast(i);
        }

        return -1;
    }
}
