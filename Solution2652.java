/*
2652. Sum Multiples

Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.

Return an integer denoting the sum of all numbers in the given range satisfying the constraint.
*/

class Solution2652 {
  public int sumOfMultiples(int n) {
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      if (verifyNumber(i)) sum += i;
    }

    return sum;
  }

  private boolean verifyNumber(int n) {
    if (n == 1 || n == 2) {
      return false;
    } else {
      return n % 3 == 0 || n % 5 == 0 || n % 7 == 0;
    }
  }
}