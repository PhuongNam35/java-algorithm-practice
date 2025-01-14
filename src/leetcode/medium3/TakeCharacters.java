package leetcode.medium3;

public class TakeCharacters {
    public static void main(String[] args) {
        TakeCharacters ans = new TakeCharacters();
        System.out.println(ans.takeCharacters("aabccbcc", 2));
    }

    public int takeCharacters(String s, int k) {
        int n = s.length();
        int[] arr = new int[3];
        for(int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
        }

        if(Math.min(Math.min(arr[0], arr[1]), arr[2]) < k)
            return -1;

        for(int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']--;

            while((Math.min(Math.min(arr[0], arr[1]), arr[2]) < k)) {

            }
        }
        return 0;
    }
}
