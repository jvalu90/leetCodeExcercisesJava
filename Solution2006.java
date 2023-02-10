/*
2006. Count Number of Pairs With Absolute Difference K

Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

The value of |x| is defined as:

    x if x >= 0.
    -x if x < 0.
*/

class Solution2006 {
  public int countKDifference(int[] nums, int k) {
    int response = 0;

    for (int i = 0; i < nums.length; i++) {
      for(int j = i + 1; j < nums.length; j++) {
        if(Math.abs(nums[i] - nums[j]) == k) response++;
      }
    }

    return response;      
  }
}