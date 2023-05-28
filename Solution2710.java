/*
2710. Remove Trailing Zeros From a String

Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.
*/

class Solution2710 {
  public String removeTrailingZeros(String num) {
    int lastZero = num.length();
    for (int i = num.length() - 1; i >= 0; i--) {
      if (num.charAt(i) != '0') break; 
      lastZero = i;
    }

    return num.substring(0, lastZero);
  }
}