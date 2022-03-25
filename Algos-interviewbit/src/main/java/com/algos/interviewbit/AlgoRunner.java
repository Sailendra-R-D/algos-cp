package com.algos.interviewbit;

import com.algos.interviewbit.bit.manipulation.Number_of_1_Bits.Number_of_1_Bits;
import com.algos.interviewbit.bit.manipulation.Trailing_Zeroes.Trailing_Zeroes;

public class AlgoRunner {
    public static void main(String[] args) {
//        Number_of_1_Bits number_of_1_bits = new Number_of_1_Bits();
//        System.out.println("setBits :: "+ number_of_1_bits.numSetBits(7));

        Trailing_Zeroes trailing_zeroes = new Trailing_Zeroes();
        System.out.println(trailing_zeroes.solve(8));
    }
}