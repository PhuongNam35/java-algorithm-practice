package leetcode.easy3;

import javax.swing.plaf.metal.MetalTheme;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        int currentConsecutive = 0;
        for(int num : nums) {
            if(num == 1)
                currentConsecutive++;
            else {
                currentConsecutive = 0;
            }
            if(maxConsecutive < currentConsecutive) {
                maxConsecutive = currentConsecutive;
            }
        }

        return maxConsecutive;
    }
}
