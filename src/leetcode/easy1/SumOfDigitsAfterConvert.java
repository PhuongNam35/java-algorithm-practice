package leetcode.easy1;

public class SumOfDigitsAfterConvert {
    public static void main(String[] args) {
        SumOfDigitsAfterConvert ans = new SumOfDigitsAfterConvert();
        System.out.println(ans.getLucky("lm", 1));
    }

    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int x : s.toCharArray()) {
            sb.append(x - 'a' + 1);
        }

        while(k > 0) {
            int sum = 0;
            for(int num : sb.toString().toCharArray()) {
                sum += num - '0';
            }
            sb = new StringBuilder(String.valueOf(sum));
            k --;
        }
        return Integer.parseInt(sb.toString());
    }
}
