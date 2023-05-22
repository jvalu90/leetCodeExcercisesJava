/*
2119. A Number After a Double Reversal

Reversing an integer means to reverse all its digits.

    For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.

Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. Return true if reversed2 equals num. Otherwise return false.
*/

class Solution2119 {
  public boolean isSameAfterReversals(int num) {
    int num1, num2 = 0;
    num1 = reverseNumber(num);
    num2 = reverseNumber(num1);

    return num == num2;
  }

  private int reverseNumber(int number) {
    int reverse = 0;
    while(number != 0) {  
      int remainder = number % 10;  
      reverse = reverse * 10 + remainder;  
      number = number/10;  
    } 

    return reverse;
  }
}