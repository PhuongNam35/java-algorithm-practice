package leetcode.easy2;

public class StrStr {
    public static void main(String[] args) {

    }

    public int strStr(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();
        if(haystack.length() < needle.length())
            return -1;

        for(int i = 0; i < hLength - nLength; i++) {
            if(haystack.substring(i, i + nLength).equals(needle))
                return i;
        }

        return -1;
    }
}
