package leetcode.medium3;

public class LargestCombination {
    public static void main(String[] args) {
        LargestCombination ans = new LargestCombination();
        System.out.println(ans.largestCombination(new int[] {8,8}));
    }

    public int largestCombination(int[] candidates) {
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            int count = 0;
            for(int candidate : candidates) {
                if((candidate & (1 << i)) != 0)
                    count ++;
            }
            ans = Math.max(ans, count);
        }

        return ans;
    }
}
