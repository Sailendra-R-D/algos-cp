package com.algos.interviewbit.bit_manipulation.Trailing_Zeroes;

public class Trailing_Zeroes {
    public int solve(int a) {
        int c = 0;
        while (a > 0) {
            if ((a & 1) == 0) {
                c++;
            } else {
                break;
            }
            a = a >> 1;
        }
        return c;
    }
}
