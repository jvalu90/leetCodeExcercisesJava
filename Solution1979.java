/*
1979. Find Greatest Common Divisor of Array

Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
*/

import java.util.*;

class Solution1979 {
  public int findGCD(int[] nums) {
    Arrays.sort(nums);
    int GCD = Integer.min(nums[0], nums[nums.length - 1]);
    
    while(GCD > 0) {
      if(nums[0] % GCD == 0 && nums[nums.length - 1] % GCD == 0) {
        break;
      }
        GCD--;
    }
  
    return GCD;
  }
}