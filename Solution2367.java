/*
2367. Number of Arithmetic Triplets

You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

    i < j < k,
    nums[j] - nums[i] == diff, and
    nums[k] - nums[j] == diff.

Return the number of unique arithmetic triplets.
*/

class Solution2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
      int arrayLength = nums.length;
      int response = 0;

      for (int i = 0; i < arrayLength -2; i++) {
        for (int j = i + 1; j < arrayLength - 1; j++) {
          for (int k = j + 1; k < arrayLength; k++) {
            if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) response++;
          }
        }
      }
      
      return response;
    }
}