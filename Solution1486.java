/*
1486. XOR Operation in an Array

You are given an integer n and an integer start.

Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.
*/

class Solution1486 {
    public int xorOperation(int n, int start) {
      int response = 0;  
      
      for(int i = 0; i< n; i++) {
        response ^= start + 2 * i;
      }

      return response;
    }
}