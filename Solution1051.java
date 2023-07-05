/*
1051. Height Checker

A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].
*/

import java.util.*;

class Solution1051 {
  public int heightChecker(int[] heights) {
    int[] expected = sortArray(heights);
    int counter = 0;

    for (int i = 0; i < heights.length; i++) {
      if (heights[i] != expected[i]) counter++;
    }
    return counter;
  }

  private int[] sortArray(int[] array) {
    int[] sortedArray = Arrays.copyOf(array, array.length);
    Arrays.sort(sortedArray);
    return sortedArray;
  }
}