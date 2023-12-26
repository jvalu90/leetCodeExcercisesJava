/*
2965. Find Missing and Repeated Values

You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.
*/

class Solution2965 {
  public int[] findMissingAndRepeatedValues(int[][] grid) {
    int[] bucket = new int[grid.length * grid.length];
    int[] response = new int[2];

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        bucket[grid[i][j] - 1]++;
      }
    }

    for (int i = 0; i < bucket.length; i++) {
      if (bucket[i] > 1) {
        response[0] = i + 1;
        continue;
      }

      if (bucket[i] == 0) {
        response[1] = i + 1;
      }
    }

    return response;
  }
}