/*
2389. Longest Subsequence With Limited Sum

You are given an integer array nums of length n, and an integer array queries of length m.

Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take from nums such that the sum of its elements is less than or equal to queries[i].

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
*/

class Solution2389 {
  public int[] answerQueries(int[] nums, int[] queries) {
    int[] response = new int[queries.length];
    Arrays.sort(nums);

    for (int i = 0; i < queries.length; i++) {
      int sum = 0;
      int numbers = 0;
      for (int j = 0; j < nums.length; j++) {        
        if ((sum += nums[j]) <= queries[i]) {
          numbers++;
        } else {
          break;
        }
      }

      response[i] = numbers;
    }  

    return response;    
  }
}

