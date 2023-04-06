/*
2553. Separate the Digits in an Array

Given an array of positive integers nums, return an array answer that consists of the digits of each integer in nums after separating them in the same order they appear in nums.

To separate the digits of an integer is to get all the digits it has in the same order.

    For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].

*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution2553 {
  public int[] separateDigits(int[] nums) {
    List<Integer> response = new ArrayList<>();
    for(int num : nums) {
      response.addAll(breakDigit(num));
    }

    return response.stream().mapToInt(i -> i).toArray();
  }

  private List<Integer> breakDigit(int num) {
    List<Integer> response = new ArrayList<>();
    
    if (num < 10) {
      response.add(num);
    } else {
      while(num > 0) {
        response.add(num % 10);
        num /= 10;
      }
    }

    Collections.reverse(response);
    
    return response;
  }
}