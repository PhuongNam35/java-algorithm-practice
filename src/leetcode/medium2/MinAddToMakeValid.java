package leetcode.medium2;

import java.util.Stack;

public class MinAddToMakeValid {
    public static void main(String[] args) {
        MinAddToMakeValid ans = new MinAddToMakeValid();
        System.out.println(ans.midAddToMakeValid(new String("()))((")));
    }

    public int midAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(stack.isEmpty())
                stack.push(c);
            else if (c == ')' && stack.peek() == '(')
                stack.pop();
            else
                stack.push(c);
        }

        return stack.size();
    }

    public int midAddToMakeValid0ms(String s) {
        int openCount = 0;
        int closeCount = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                openCount++;
            else {
                if(openCount > 0)
                    openCount--;
                else
                    closeCount++;
            }
        }

        return openCount + closeCount;
    }
}
