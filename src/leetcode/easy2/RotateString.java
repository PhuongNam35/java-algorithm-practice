package leetcode.easy2;

public class RotateString {
    public static void main(String[] args) {
        RotateString ans = new RotateString();
        System.out.println(ans.rotateString("defdefab", "defabdef"));
    }

    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;

        return (s + s).contains(goal);
    }
}
