/*
2520. Count the Digits That Divide a Number

Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.
*/

class Solution2520 {
  public int countDigits(int num) {
    int helperDigit = num;
    int divisibles = 0;

    while(helperDigit > 0) {
      int digit = helperDigit % 10;
      if (num % digit == 0) divisibles++;
      helperDigit /= 10;
    }

    return divisibles;      
  }  
}