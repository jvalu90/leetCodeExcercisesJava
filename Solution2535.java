/*
2535. Difference Between Element Sum and Digit Sum of an Array

You are given a positive integer array nums.

    The element sum is the sum of all the elements in nums.
    The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.

Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.
*/

class Solution2535 {
    public int differenceOfSum(int[] nums) {
      int sumNums = 0;
      int sumDigits = 0;
      
      for(int num : nums) {
        sumNums += num;             
        int digits = num;
        
        while (digits > 0) {
          sumDigits += digits % 10;
          digits /= 10;
        }
      }

      return Math.abs(sumNums - sumDigits);
    }
}