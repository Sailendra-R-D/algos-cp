package com.algos.interviewbit;

import com.algos.interviewbit.bit.manipulation.Min_XOR_value.Min_XOR_value;

import java.util.ArrayList;
import java.util.Arrays;

public class AlgoRunner {
    public static void main(String[] args) {
//        Number_of_1_Bits number_of_1_bits = new Number_of_1_Bits();
//        System.out.println("setBits :: "+ number_of_1_bits.numSetBits(7));

//        Trailing_Zeroes trailing_zeroes = new Trailing_Zeroes();
//        System.out.println(trailing_zeroes.solve(8));

        Min_XOR_value min_xor_value = new Min_XOR_value();
        System.out.println(min_xor_value.findMinXor(new ArrayList<>(Arrays.asList(0, 2, 5, 7))));

    }
}