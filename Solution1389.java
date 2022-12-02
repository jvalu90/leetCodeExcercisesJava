/*
1389. Create Target Array in the Given Order

Given two arrays of integers nums and index. Your task is to create target array under the following rules:

    Initially target array is empty.
    From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
    Repeat the previous step until there are no elements to read in nums and index.

Return the target array.

It is guaranteed that the insertion operations will be valid.
*/

import java.util.Arrays;

class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
      int[] targetArray = new int[nums.length];
      Arrays.fill(targetArray, 0);

      for(int i = 0; i < index.length; i++) {
        for(int j = index[i]; j < targetArray.length; j++) {
          targetArray[j + 1] = targetArray[j];
        }

        targetArray[index[i]] = nums[i];
      }

      return targetArray;
    }
}