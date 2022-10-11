/*
1512. Number of Good Pairs

Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/

class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
      int response = 0;

      for(int i = 0; i < nums.length; i++){
        for(int j = i + 1; j < nums.length; j++){
          if(nums[i] == nums[j]) response++;
        }
      }

      return response;
    }
}