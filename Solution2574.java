/*
2574. Left and Right Sum Differences

Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

    answer.length == nums.length.
    answer[i] = |leftSum[i] - rightSum[i]|.

Where:

    leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
    rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.

Return the array answer.
*/

class Solution2574 {
  public int[] leftRightDifference(int[] nums) {
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];
  
    for (int i = 1; i < nums.length; i++) {
      left[i] += left[i-1] + nums[i-1];
    }
    
    for (int i = nums.length -2; i >= 0; i--) {
      right[i] += right[i+1] + nums[i+1];
    }
        
    for(int i = 0;i < nums.length; i++){
      nums[i] = Math.abs(left[i] - right[i]);
    }
  
    return nums;
  }
}