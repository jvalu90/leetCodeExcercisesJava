/*
905. Sort Array By Parity

Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.
*/

class Solution905 {
  public int[] sortArrayByParity(int[] nums) {
    int n = nums.length;
    if (n == 0) return nums;

    for (int i  = 0, j = 1; i < n && j < n;) {
      if (nums[i] % 2 == 0) {
        i++;
        j++;
      } else {
        if(nums[j] % 2 == 0) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
          i++;
          j++;
        } else {
          j++;
        }
      }
    }  

    return nums;      
  }
}