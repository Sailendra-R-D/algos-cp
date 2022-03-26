package com.algos.interviewbit.bit_manipulation.Reverse_Bits;

public class Reverse_Bits {
    public long reverse(long a) {
        long rev = 0;
        int i = 1;
        while (a > 0) {
            if (a % 2 == 1) {
                rev += Math.pow(2, 32 - i);
            }
            a /= 2;
            i++;
        }
        return rev;
    }
}
