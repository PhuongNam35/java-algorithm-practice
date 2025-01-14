package leetcode.medium3;

import java.util.Arrays;

public class AddSpaces {
    public static void main(String[] args) {
        AddSpaces ans = new AddSpaces();
        System.out.println(ans.addSpaces02("ilovetohtcone", new int[] {1,5,7,10}));
    }

    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int space : spaces) {
            sb.append(s, index, space).append(" ");
            index = space;
        }
        sb.append(s, index, s.length());
        return sb.toString();
    }

    public String addSpaces01(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int space : spaces) {
            sb.append(s, index, space);
            sb.append(" ");
            index = space;
        }

        sb.append(s, index, s.length());

        return sb.toString();
    }

    public String addSpaces02(String s, int[] spaces) {
        int n = s.length(), m = spaces.length;
        char[] ans = new char[n + m];
        char[] s1 = s.toCharArray();

        int i = 0;
        int index = 0;
        for(int space : spaces) {
            while(i < space) {
                ans[index++] = s1[i++];
            }
            ans[index++] = ' ';
        }

        while(i < n) {
            ans[index++] = s1[i++];
        }

        return new String(ans);
    }
}
