package com.algos.interviewbit.bit.manipulation.Number_of_1_Bits;

public class Number_of_1_Bits {
    public int numSetBits(long a) {
        int c = 0;
        while (a > 0) {
            if ((a & 1) == 1) {
                c++;
            }
            a = a >> 1;
        }
        return c;
    }
}