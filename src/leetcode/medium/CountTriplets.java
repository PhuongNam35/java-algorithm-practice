package leetcode.medium;

public class CountTriplets {
    public static void main(String[] args) {
        CountTriplets testAnswer = new CountTriplets();
        System.out.println(testAnswer.countTriplets(new int[]{2,3,1,6,7}));
        System.out.println(testAnswer.countTriplets1(new int[]{2,3,1,6,7}));
    }

    public int countTriplets(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            int a = 0;
            for(int j = i + 1; j < arr.length; j++) {
                a ^= arr[j - 1];
                int b = 0;
                for (int k = j; k < arr.length; k++) {
                    b ^= arr[k];
                    if(a == b)
                        count++;
                }
            }
        }
        return count;
    }

    public int countTriplets1(int[] arr) {
        int count = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            int xor = arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                xor ^= arr[j];
                if(xor == 0) count += (j - i);
            }
        }
        return count;
    }
}
