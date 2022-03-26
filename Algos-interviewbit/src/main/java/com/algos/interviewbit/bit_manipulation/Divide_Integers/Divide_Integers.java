package com.algos.interviewbit.bit_manipulation.Divide_Integers;

public class Divide_Integers {
    public int divide(int A, int B) {
        long dividend = A;
        long divisor = B;
        int sign;                                             // this will store the sign of final result
        if (dividend < 0 && divisor < 0 || dividend > 0 && divisor > 0) //if both the dividend and divisor is of same sign then answer will be positive else negative
        {
            sign = 1;
        } else {
            sign = -1;
        }
        dividend = Math.abs(dividend); // take absolute values because we have already taken care of sign of final answer
        divisor = Math.abs(divisor);
        if (dividend == 0) // zero divided by any number is 0
        {
            return 0;
        } else if (divisor == 1) // Dividing a number by 1 gives the number itself
        {
            long h = sign * dividend; // Find the answer by multiplying with the sign
            if (h > Integer.MAX_VALUE || h < Integer.MIN_VALUE)    // check for overflow
            {
                return Integer.MAX_VALUE;
            } else {
                return (int) h;
            }
        }
    /* Since we do not have to use multiplication, division and mod operator what we are gonna do is
    make use of logarithms. We know that log(a/b)=log(a)-log(b). We will use this property */

    /* So our answer = a/b ... taking log on the both sides we get log(ans)=log(a/b) ...using the above property
       we get log(ans)=log(a)-log(b)...now we have to remove the log from left hand side to get the answer.
       we will get ans=e^(log(a)-log(b))l*/

        long ans = (long) (sign * (Math.exp(Math.log(dividend) - Math.log(divisor))));
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) // again check for overflow
        {
            return Integer.MAX_VALUE;
        } else {
            return (int) ans; //return answer
        }
    }
}
