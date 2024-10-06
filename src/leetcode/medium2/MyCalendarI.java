package leetcode.medium2;

import java.util.ArrayList;
import java.util.List;

class MyCalendarI {
    private List<int[]> calendar;

    public MyCalendarI() {
        calendar = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for(int[] x : calendar) {
            if(start == x[0] || start > x[0] && start < x[1] || start < x[0] && end > x[0])
                return false;
        }
        calendar.add(new int[] {start, end});
        return true;
    }
}
