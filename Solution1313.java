/*
1313. Decompress Run-Length Encoded List

We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.
*/

import java.util.ArrayList;

class Solution1313 {
    public int[] decompressRLElist(int[] nums) {
      ArrayList<Integer> list = new ArrayList<>();

      for (int i = 0; i < nums.length; i += 2) {
        for (int j = 0; j < nums[i]; j++) {
          list.add(nums[i+1]);
        }
      }

      return solve(list);
    }

  private static int[] solve(ArrayList<Integer> nums) {
    int[] arr = new int[nums.size()];
    for(int i = 0; i < nums.size(); i++) {
      arr[i] = nums.get(i);  
    }
    
    return arr;
  }
}