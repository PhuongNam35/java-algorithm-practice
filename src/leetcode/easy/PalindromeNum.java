package leetcode.easy;

public class PalindromeNum {
    public boolean isPalindrome(int x) {
        String strX = String.valueOf(x);
        for(int i = 0; i < strX.length(); i++) {
            if(strX.charAt(i) != strX.charAt(strX.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        //check if x is negative
        if(x < 0)
            return false;

        //iterate through x elements to create a new number
        int reversed = 0;

        while(x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }

    public boolean isPalindrome3(int x) {
        if(x < 0)
            return false;

        int reversed = 0;
        int temp = x;
        while(temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

        return (reversed == x);
    }

    public boolean isStringPalindrome(String s) {
        int length = s.length();
        for(int i = 0; i < length / 2; i++) {
            if(s.charAt(i) != s.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeNum palindromeNum = new PalindromeNum();
//        System.out.println(palindromeNum.isPalindrome3(12321));
//        System.out.println(palindromeNum.isPalindrome2(12321));
        System.out.println(palindromeNum.isStringPalindrome("abcacba"));
    }
}
