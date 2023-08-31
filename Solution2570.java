/*
2570. Merge Two 2D Arrays by Summing Values

You are given two 2D integer arrays nums1 and nums2.

    nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
    nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.

Each array contains unique ids and is sorted in ascending order by id.

Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:

    Only ids that appear in at least one of the two arrays should be included in the resulting array.
    Each id should be included only once and its value should be the sum of the values of this id in the two arrays. If the id does not exist in one of the two arrays then its value in that array is considered to be 0.

Return the resulting array. The returned array must be sorted in ascending order by id.
*/

import java.util.*;

class Solution2570 {
  public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
    int[] bucket = new int[1001];
    List<int[]> response = new ArrayList<>();

    for (int i = 0; i < nums1.length; i++) {
      bucket[nums1[i][0]] += nums1[i][1];
    }

    for (int i = 0; i < nums2.length; i++) {
      bucket[nums2[i][0]] += nums2[i][1];
    }

    for (int i = 0; i < bucket.length; i++) {
      if (bucket[i] >= 1) {
        response.add(new int[]{i, bucket[i]});
      }
    }

    return response.toArray(new int[0][]);
  }
}