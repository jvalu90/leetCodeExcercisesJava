/*
2733. Neither Minimum nor Maximum

Given an integer array nums containing distinct positive integers, find and return any number from the array that is neither the minimum nor the maximum value in the array, or -1 if there is no such number.

Return the selected integer.
*/

class Solution2733 {
  public int findNonMinOrMax(int[] nums) {
    if (nums.length <= 2) return -1;
    int [] bucket = new int[101];
    int count = 0;
    int response = 0;

    for (int i = 0; i < nums.length; i++) {
      bucket[nums[i]]++;
    }

    for (int i = 0; i < bucket.length; i++) {
     if(bucket[i] != 0) count++;
      if (count == 2) {
        response = i;
        break;
      }
    }

    return response;
  }
}