/*
561. Array Partition

Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
*/

import java.util.*;

class Solution561 {
  public int arrayPairSum(int[] nums) {
    int response = 0;
    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i += 2) {
      response += nums[i];
    }

    return response;
  }
}
