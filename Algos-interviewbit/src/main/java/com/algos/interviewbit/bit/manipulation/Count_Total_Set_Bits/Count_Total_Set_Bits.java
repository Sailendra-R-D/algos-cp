package com.algos.interviewbit.bit.manipulation.Count_Total_Set_Bits;

public class Count_Total_Set_Bits {
    public int solve(int A) {
        int x = 0;
        return (int) (count_bits(A) % 1000000007);
    }

    private long count_bits(long n) {
        if (n <= 1) return n;
        long k = (long) (Math.log(n) / Math.log(2));
        return (long) ((k) * Math.pow(2, k - 1) + (n - Math.pow(2, k) + 1) + count_bits((long) (n - Math.pow(2, k))));
    }
}
