/*
2485. Find the Pivot Integer

Given a positive integer n, find the pivot integer x such that:

    The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.

Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.
*/

class Solution2485 {
  public int pivotInteger(int n) {
    int response = -1;

    if(n == 1) return n;

    for(int i = 1; i <= n; i++) {
      if(lessThanOrEqual(1, i) == greaterThanOrEqual(i, n)) return i;
    }
    return response;
  }

  private int lessThanOrEqual(int lower, int upper) {
    if(lower == upper) return lower;
    else return upper + lessThanOrEqual(lower, upper - 1);
  }

  private int greaterThanOrEqual(int lower, int upper) {
    if(lower == upper) return lower;
    else return upper + lessThanOrEqual(lower, upper - 1);
  }
}