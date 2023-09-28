/*
349. Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
*/

class Solution349 {
  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    for (int num : nums1) {
      set1.add(num);
    }

    for (int num: nums2) {
      if (set1.contains(num)) set2.add(num);
    }

    int[] response = new int[set2.size()];
    int index = 0;
    for (int n : set2){
      response[index++] = n;
    }

    return response;
  }
}