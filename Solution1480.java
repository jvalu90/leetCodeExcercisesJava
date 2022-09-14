/*
1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
*/

public class Solution1480 {
  public int[] runningSum(int[] nums) {
    int[] runningSumArray = new int[nums.length];
    runningSumArray[0] = nums[0];
    
    for (int i = 1; i < nums.length; i++) {
        runningSumArray[i] = runningSumArray[i - 1] + nums[i];
    }
    
      return runningSumArray;
    }
}