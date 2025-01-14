package hackerrank.warmup;

public class Test {
    public static void main(String[] args) {
        Test ans = new Test();
        System.out.println(ans.testQuestion(5,0,2));
    }

    public String testQuestion(int AA, int AB, int BB) {
        StringBuilder result = new StringBuilder();
        int countA = AA;
        int countB = BB;

        while (countA > 0 || countB > 0) {
            // Check the last two characters in the result
            int len = result.length();
            boolean endWithAA = len >= 2 && result.charAt(len - 1) == 'A' && result.charAt(len - 2) == 'A';
            boolean endWithBB = len >= 2 && result.charAt(len - 1) == 'B' && result.charAt(len - 2) == 'B';

            if (endWithAA) {
                // If the last two are "AA", add "B" if possible
                if (countB > 0) {
                    result.append("B");
                    countB--;
                } else {
                    break; // No more Bs to prevent "AAA"
                }
            } else if (endWithBB) {
                // If the last two are "BB", add "A" if possible
                if (countA > 0) {
                    result.append("A");
                    countA--;
                } else {
                    break; // No more As to prevent "BBB"
                }
            } else {
                // Choose the character with the larger count to maximize the length
                if (countA >= countB) {
                    result.append("A");
                    countA--;
                } else {
                    result.append("B");
                    countB--;
                }
            }
        }

        return result.toString();
    }
}
