/*
2913. Subarrays Distinct Element Sum of Squares I

You are given a 0-indexed integer array nums.

The distinct count of a subarray of nums is defined as:

    Let nums[i..j] be a subarray of nums consisting of all the indices from i to j such that 0 <= i <= j < nums.length. Then the number of distinct values in nums[i..j] is called the distinct count of nums[i..j].

Return the sum of the squares of distinct counts of all subarrays of nums.

A subarray is a contiguous non-empty sequence of elements within an array.
*/

class Solution2913 {
  public int sumCounts(List<Integer> nums) {
    int response = 0;
    for (int i = 0; i < nums.size(); i++) {
      for (int j = 0; j < nums.size(); j++) {
        response += Math.pow(verifyDistinct(nums, i, j), 2);
      }
    }

    return response;      
  }

  private int verifyDistinct(List<Integer> nums, int start, int end) {
    Set<Integer> uniques = new HashSet<>();
    for (int i = start; i <= end; i++) {
      uniques.add(nums.get(i));
    }
    return uniques.size();
  }
}