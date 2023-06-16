/*
1748. Sum of Unique Elements

You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.
*/

import java.util.*;

class Solution1748 {
  public int sumOfUnique(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int response = 0;

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.compute(nums[i], (k, v) -> v + 1);
      } else {
        map.put(nums[i], 1);
      }
    }

    for (Integer key : map.keySet()) {
      if (map.get(key) == 1) response += key;
    }

    return response;
  }
}