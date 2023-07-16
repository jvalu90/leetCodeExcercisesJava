/*
2778. Sum of Squares of Special Elements

You are given a 1-indexed integer array nums of length n.

An element nums[i] of nums is called special if i divides n, i.e. n % i == 0.

Return the sum of the squares of all special elements of nums.
*/

class Solution2778 {
  public int sumOfSquares(int[] nums) {
    int response = 0; 
    int length = nums.length;
    for (int i = 0; i < nums.length; i++) {
      if (length % (i+1) == 0) {
        response += Math.pow(nums[i], 2);
      }
    }

    return response;
  }
}