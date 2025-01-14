package practice;

public class GenerateString {
    public static void main(String[] args) {
        GenerateString ans = new GenerateString();
        System.out.println(ans.generateString(78));
    }

    public String generateString(int n) {
        StringBuilder ans = new StringBuilder();
        if(n < 27) {
            for(int i = 0; i < n; i++) {
                char c = (char) ('a' + i%26);
                ans.append(c);
            }
            return ans.toString();
        }

        else {
            int thres = n / 26;
            int k = 0;
            while(k < thres) {
                for(int i = 0; i < 26; i++) {
                    char c = (char) ('a' + i%26);
                    ans.append(c);
                }
                k++;
            }
            return ans.toString();
        }
    }
    
}
