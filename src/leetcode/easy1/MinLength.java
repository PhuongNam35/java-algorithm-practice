package leetcode.easy1;

import java.util.Stack;

public class MinLength {
    public static void main(String[] args) {
        MinLength ans = new MinLength();
        System.out.println(ans.minLength2("ABFCACDB"));
    }

    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(stack.empty()) {
                stack.push(current);
            }

            else if(current == 'B' && stack.peek() == 'A') {
                stack.pop();
//                stack.pop();
            }

            else if(current == 'D' && stack.peek() == 'C') {
                stack.pop();
//                stack.pop();
            }

            else stack.push(current);
        }

        return stack.size();
    }

    public int minLength2(String s) {
        int n = s.length();
        char[] check_array = new char[n];
        int cnt = -1;

        for(char c : s.toCharArray()) {
            if(cnt >= 0 && ((c == 'B' && check_array[cnt] == 'A') || (c == 'D' && check_array[cnt] == 'C'))) {
                cnt--;
            }
            else {
                check_array[++cnt] = c;
            }
        }
        return cnt + 1;
    }
}
