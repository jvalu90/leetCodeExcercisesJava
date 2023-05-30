/*
1295. Find Numbers with Even Number of Digits

Given an array nums of integers, return how many of them contain an even number of digits.
*/

class Solution1295 {
  public int findNumbers(int[] nums) {
    int response = 0;

    for (int num : nums) {
      if(verifyEvenNumber(num)) response++;
    }

    return response;
  }

  private boolean verifyEvenNumber(int num) {
    int digits = 0;
    while (num != 0) {
      digits++;
      num /= 10;
    }

    return digits % 2 == 0;
  }
}