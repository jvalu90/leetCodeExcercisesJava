/*
1863. Sum of All Subset XOR Totals

The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.

    For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.

Given an array nums, return the sum of all XOR totals for every subset of nums. 

Note: Subsets with the same elements should be counted multiple times.

An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.
*/

class Solution1863 {
  public int subsetXORSum(int[] nums) {
    int n = nums.length;
    int tmp;
    int sum = 0;
  
    for (int i = 0; i < (1<<n); i++) {
      tmp = 0;
      
      for (int j = 0; j < n; j++) {
        if ((i & (1 << j)) > 0) {
          tmp = tmp ^ nums[j];
        }
      }
    
      sum+=tmp;
    }
  
    return sum;
  }
}