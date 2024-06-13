package leetcode.medium;

import java.math.BigInteger;

public class NumSteps {
    public static void main(String[] args) {
        NumSteps testAnswer = new NumSteps();
        System.out.println(testAnswer.numSteps("1111011110000011100000110001011011110010111001010111110001"));
        System.out.println(testAnswer.numSteps1("1111011110000011100000110001011011110010111001010111110001"));
    }

    public int numSteps(String s) {
        BigInteger biToDec = BigInteger.ZERO;
        for(int i = s.length() - 1; i >= 0; i--) {
            int bit = s.charAt(i) - '0';
            if (bit == 1)
                biToDec = biToDec.add(BigInteger.valueOf(2).pow(s.length() - 1 - i));
        }

        int step = 0;
        while(biToDec.compareTo(BigInteger.ONE) > 0) {
            if(biToDec.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                biToDec = biToDec.divide(BigInteger.valueOf(2));
            } else {
                biToDec = biToDec.add(BigInteger.ONE);
            }
            step ++;
        }
        return step;
    }

    public int numSteps1(String s) {
        int l = s.length() - 1;
        int carry = 0;
        int count = 0;
        while(l > 0) {
            if(Character.getNumericValue(s.charAt(l)) + carry == 0) {
                carry = 0;
                count ++;
            } else if(Character.getNumericValue(s.charAt(l)) + carry == 2) {
                carry = 1;
                count ++;
            } else {
                carry = 1;
                count += 2;
            }
            l--;
        }
        if (carry == 1)
            count ++;

        return count;
    }
}
