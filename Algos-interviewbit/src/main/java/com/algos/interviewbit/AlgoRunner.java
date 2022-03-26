package com.algos.interviewbit;

import com.algos.interviewbit.bit_manipulation.Count_Total_Set_Bits.Count_Total_Set_Bits;
import com.algos.interviewbit.bit_manipulation.Min_XOR_value.Min_XOR_value;
import com.algos.interviewbit.bit_manipulation.Number_of_1_Bits.Number_of_1_Bits;
import com.algos.interviewbit.bit_manipulation.Reverse_Bits.Reverse_Bits;
import com.algos.interviewbit.bit_manipulation.Trailing_Zeroes.Trailing_Zeroes;

import java.util.ArrayList;
import java.util.Arrays;

public class AlgoRunner {
    public static void main(String[] args) {
//        Number_of_1_Bits number_of_1_bits = new Number_of_1_Bits();
//        System.out.println("setBits :: " + number_of_1_bits.numSetBits(7));
//
//        Trailing_Zeroes trailing_zeroes = new Trailing_Zeroes();
//        System.out.println("trailingZeroes :: " + trailing_zeroes.solve(8));
//
//        Min_XOR_value min_xor_value = new Min_XOR_value();
//        System.out.println("min XOR Value ::" + min_xor_value.findMinXor(new ArrayList<>(Arrays.asList(0, 2, 5, 7))));
//
//        Count_Total_Set_Bits count_total_set_bits = new Count_Total_Set_Bits();
//        System.out.println("total set bits count :: " + count_total_set_bits.solve(3));

        Reverse_Bits reverse_bits = new Reverse_Bits();
        System.out.println("reversed bits value :: " + reverse_bits.reverse(3));
    }
}