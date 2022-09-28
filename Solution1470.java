/*
1470. Shuffle the Array

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/

public class Solution1470 {
  public int[] shuffle(int[] nums, int n) {
    int[] arrayShuffle = new int[2*n];
    int j = 0;
    
    for(int i = 0; i < n; i++) {
      arrayShuffle[j++] = nums[i];
      arrayShuffle[j++] = nums[i+n];
    }

    return arrayShuffle;
      
  }
}