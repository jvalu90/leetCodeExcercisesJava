/*
2843. Count Symmetric Integers

You are given two positive integers low and high.

An integer x consisting of 2 * n digits is symmetric if the sum of the first n digits of x is equal to the sum of the last n digits of x. Numbers with an odd number of digits are never symmetric.

Return the number of symmetric integers in the range [low, high].
*/

class Solution843 {
  public int countSymmetricIntegers(int low, int high) {
    int response = 0;
    for (int i = low; i <= high; i++) {
      if (verifySymetricNumber(i)) response++;
    }

    return response;
  }

  private boolean verifySymetricNumber(int number) {
    if (number <= 10) return false;

    int sum1 = 0;
    int sum2 = 0;
    String numberS = String.valueOf(number);

    if (numberS.length() % 2 != 0) return false;

    
    for (int i = 0; i < numberS.length() / 2; i++) {
      sum1 += numberS.charAt(i);
      sum2 += numberS.charAt(i+ numberS.length() / 2);
    }

    return sum1 == sum2;
  }
}