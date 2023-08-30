/*
2529. Maximum Count of Positive Integer and Negative Integer

Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.

    In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.

Note that 0 is neither positive nor negative.
*/

class Solution2529 {
  public int maximumCount(int[] nums) {
    int negative = 0;
    int positive = 0;

    for (int num : nums) {
      if (num < 0) {
        negative++;
        continue;
      }

      if (num > 0) {
        positive++;
      }
    }

    return Math.max(negative, positive);
  }
}