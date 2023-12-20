/*
2951. Find the Peaks

You are given a 0-indexed array mountain. Your task is to find all the peaks in the mountain array.

Return an array that consists of indices of peaks in the given array in any order.

Notes:

    A peak is defined as an element that is strictly greater than its neighboring elements.
    The first and last elements of the array are not a peak.

*/

import java.util.*;

class Solution2951 {
  public List<Integer> findPeaks(int[] mountain) {
    List<Integer> response = new ArrayList<>();

    for (int i = 1; i < mountain.length - 1; i++) {
      if (verifyPeak(mountain[i], mountain[i - 1], mountain[i + 1])) {
        response.add(i);
      }
    }
    return response;
  }

  private boolean verifyPeak(int element, int leftElement, int rightElement) {
    return element > leftElement && element > rightElement;
  }
}