/*
2956. Find Common Elements Between Two Arrays

You are given two 0-indexed integer arrays nums1 and nums2 of sizes n and m, respectively.

Consider calculating the following values:

    The number of indices i such that 0 <= i < n and nums1[i] occurs at least once in nums2.
    The number of indices i such that 0 <= i < m and nums2[i] occurs at least once in nums1.

Return an integer array answer of size 2 containing the two values in the above order.
*/

class Solution2956 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
      int[] response = new int[2];
      response[0] = findCommonElementsInArray(nums1, nums2); 
      response[1] = findCommonElementsInArray(nums2, nums1);
      return response; 
    }

    private int findCommonElementsInArray(int[] base, int[] reference) {
      int response = 0;
      for (int num : base) {
        for (int num2 : reference) {
          if (num == num2) {
            response++;
            break;
          }
        }
      }

      return response;
    }
}