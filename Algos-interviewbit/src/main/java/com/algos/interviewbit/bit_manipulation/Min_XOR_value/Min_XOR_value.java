package com.algos.interviewbit.bit_manipulation.Min_XOR_value;

import java.util.ArrayList;
import java.util.Collections;

public class Min_XOR_value {
    public int findMinXor(ArrayList<Integer> A) {
        int mina = Integer.MAX_VALUE;
        int i = 0;
        Collections.sort(A);
        while (i < A.size() - 1) {
            mina = Math.min(mina, A.get(i) ^ A.get(i + 1));
            i++;
        }
        return mina;
    }
}
