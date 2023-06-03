/*
2670. Find the Distinct Difference Array

You are given a 0-indexed array nums of length n.

The distinct difference array of nums is an array diff of length n such that diff[i] is equal to the number of distinct elements in the suffix nums[i + 1, ..., n - 1] subtracted from the number of distinct elements in the prefix nums[0, ..., i].

Return the distinct difference array of nums.

Note that nums[i, ..., j] denotes the subarray of nums starting at index i and ending at index j inclusive. Particularly, if i > j then nums[i, ..., j] denotes an empty subarray.
*/

import java.util.*;

class Solution2670 {
  public int[] distinctDifferenceArray(int[] nums) {
    int[] diff = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      diff[i] = calculateDistincts(nums, 0, i) - calculateDistincts(nums, i + 1, nums.length -1);
    }

    return diff;
  }

  private int calculateDistincts(int[] nums, int start, int end) {
    Set<Integer> set = new HashSet<>();

    for (int i = start; i <= end; i++) {
      set.add(nums[i]);
    }

    return set.size();
  }
}