/*
2864. Maximum Odd Binary Number

You are given a binary string s that contains at least one '1'.

You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.

Return a string representing the maximum odd binary number that can be created from the given combination.

Note that the resulting string can have leading zeros.
*/

class Solution2864 {
  public String maximumOddBinaryNumber(String s) {
    char[] ch = s.toCharArray();
    Arrays.sort(ch);
    return new StringBuilder("1"+(new String(ch)).substring(0, s.length()-1)).reverse().toString();
  }
}