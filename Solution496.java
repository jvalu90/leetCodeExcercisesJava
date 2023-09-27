/*
496. Next Greater Element I

The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
*/

class Solution496 {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] response = new int[nums1.length];

    for (int i = 0; i < response.length; i++) {
      response[i] = findNextMaxNum(nums2, nums1[i]);
    }

    return response;     
  }

  private int findNextMaxNum(int[] arr, int n) {
    int temp = -1 ;
    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == n) {
        while (i < (arr.length - 1) && temp <= n) {
          i++;
          temp = Math.max(n, arr[i]);
        }
        break;
      }
    }
    
    return (temp == n) ? -1 : temp;
  }
}