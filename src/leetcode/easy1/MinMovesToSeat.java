package leetcode.easy1;

import java.util.Arrays;

public class MinMovesToSeat {
    public static void main(String[] args) {
        MinMovesToSeat testAns = new MinMovesToSeat();
        System.out.println(testAns.minMovesToSeat(new int[] {2,2,6,6}, new int[] {1,3,2,6}));
    }

    public int minMovesToSeat(int[] seats, int[] students) {
        int n = seats.length, count = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        for(int i = 0; i < n; i ++) {
            count += (Math.abs(students[i] - seats[i]));
        }

        return count;
    }

    public int minMovesToSeat2(int[] seats, int[] students) {
        return 0;
    }
}
