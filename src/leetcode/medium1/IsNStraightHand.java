package leetcode.medium1;

import java.util.Arrays;
import java.util.TreeMap;

public class IsNStraightHand {
    public static void main(String[] args) {
        IsNStraightHand testAns = new IsNStraightHand();
        System.out.println(testAns.isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8,9}, 5));
    }
    public boolean isNStraightHand1(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        if(groupSize == 1) return true;

        Arrays.sort(hand);
        int i = 0;

        while(i < hand.length - 1) {
            if(hand[i+1] < hand[i] + 1) {
                Arrays.sort(hand, i , hand.length - 1);
            }
            for(int j = i + 1; j < groupSize; j++) {
                if(hand[j] == hand[i] + 1) {
                    int temp = hand[i + 1];
                    hand[i + 1] = hand[j];
                    hand[j] = temp;
                    break;
                }
                if(j == hand.length - 1) return false;
            }
            i = i + groupSize;
        }
        return true;
    }

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        while(!map.isEmpty()) {
            int check = map.firstKey();

            for(int i = 0; i < groupSize; i ++) {
                int current = check + i;
                if(!map.containsKey(current))
                    return false;
                int count = map.get(current);
                if(count == 1)
                    map.remove(current);
                else
                    map.put(current, count - 1);
            }
        }

        return true;
    }

    public boolean findsucessors(int[] hand, int groupSize, int i, int n) {
        int f = hand[i] + 1;
        hand[i] = -1;
        int count = 1;
        i += 1;
        while (i < n && count < groupSize) {
            if (hand[i] == f) {
                f = hand[i] + 1;
                hand[i] = -1;
                count++;
            }
            i++;
        }
        if (count != groupSize)
            return false;
        else
            return true;
    }

    public boolean isNStraightHandRef(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0)
            return false;
        Arrays.sort(hand);
        int i = 0;
        for (; i < n; i++) {
            if (hand[i] >= 0) {
                if (!findsucessors(hand, groupSize, i, n))
                    return false;
            }
        }
        return true;
    }
}
