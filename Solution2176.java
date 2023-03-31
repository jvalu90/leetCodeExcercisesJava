/*
2176. Count Equal and Divisible Pairs in an Array

Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 <= i < j < n, such that nums[i] == nums[j] and (i * j) is divisible by k. 
*/

class Solution2176 {
  public int countPairs(int[] nums, int k) {
    int response = 0;

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (areDivisibles(i, j, k) && nums[i] == nums[j]) response++;
      }
    }

    return response;
  }

  private boolean areDivisibles(int i, int j, int k) {
    return (i * j) % k == 0;
  }
}