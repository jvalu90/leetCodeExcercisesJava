/*
2848. Points That Intersect With Cars

You are given a 0-indexed 2D integer array nums representing the coordinates of the cars parking on a number line. For any index i, nums[i] = [starti, endi] where starti is the starting point of the ith car and endi is the ending point of the ith car.

Return the number of integer points on the line that are covered with any part of a car.
*/

import java.util.*;

class Solution2848 {
  public int numberOfPoints(List<List<Integer>> nums) {
    Set<Integer> response = new HashSet<>();

    for (List<Integer> car : nums) {
      for (int i = car.get(0); i <= car.get(1); i++) {
        response.add(i);
      }
    } 

    return response.size();
  }
}