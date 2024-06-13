package leetcode.easy;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString testAns = new ReverseString();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        testAns.reverseString1(input);
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - left - 1;

        while(left < right) {
            char temp;
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left ++;
            right = s.length - left - 1;
        }
        System.out.println(s);
    }

    public void reverseString1(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    public void reverse(char[] s, int left, int right) {
        if(left >= right) return;

        char temp;
        temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverse(s, left + 1, right - 1);
    }
}
