/*
961. N-Repeated Element in Size 2N Array

You are given an integer array nums with the following properties:

    nums.length == 2 * n.
    nums contains n + 1 unique elements.
    Exactly one element of nums is repeated n times.

Return the element that is repeated n times.
*/

class Solution961 {
  public int repeatedNTimes(int[] nums) {
    int[] bucket = new int[10001];

    for (int i = 0; i < nums.length; i++) {
      bucket[nums[i]]++;
      if (bucket[nums[i]] == nums.length / 2) return nums[i];
    }

    return 0;
  }
}