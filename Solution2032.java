/*
2032. Two Out of Three

Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
*/

import java.util.*;

class Solution2032 {
  public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    List<Integer> response = new ArrayList<>();
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    Set<Integer> set3 = new HashSet<>();
    int[] bucket = new int[101];

    for (int i = 0; i < nums1.length; i++) {
      set1.add(nums1[i]);
    }

    for (int i = 0; i < nums2.length; i++) {
      set2.add(nums2[i]);
    }

    for (int i = 0; i < nums3.length; i++) {
      set3.add(nums3[i]);
    }

    for (Integer value : set1) {
      bucket[value]++;
    }

    for (Integer value : set2) {
      bucket[value]++;
    }

    for (Integer value : set3) {
      bucket[value]++;
    }

    for (int i = 0; i < bucket.length; i++) {
      if (bucket[i] >= 2) response.add(i);
    }

    return response;
  }
}