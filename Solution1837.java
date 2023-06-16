/*
1837. Sum of Digits in Base K

Given an integer n (in base 10) and a base k, return the sum of the digits of n after converting n from base 10 to base k.

After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.
*/

class Solution1837 {
  public int sumBase(int n, int k) {
    int response = 0;
    while (n > 0) {
      response += n % k;
      n /= k;
    }
    return response;
  }
}