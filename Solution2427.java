/*
2427. Number of Common Factors

Given two positive integers a and b, return the number of common factors of a and b.

An integer x is a common factor of a and b if x divides both a and b.
*/

class Solution2427 {
  public int commonFactors(int a, int b) {
    int response = 0;
    int min = Math.min(a, b);

    if (a % 2 != 0 || b % 2 != 0) {
      for (int i = 1; i <= min; i += 2) {
        if(a % i == 0 && b % i == 0) response++;
      }
    } else {
      for (int i = 1; i <= min; i++) {
        if(a % i == 0 && b % i == 0) response++;
      }
    }

    return response;
  }
}