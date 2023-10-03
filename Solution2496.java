/*
2496. Maximum Value of a String in an Array

The value of an alphanumeric string can be defined as:

    The numeric representation of the string in base 10, if it comprises of digits only.
    The length of the string, otherwise.

Given an array strs of alphanumeric strings, return the maximum value of any string in strs.
*/

class Solution2496 {
  public int maximumValue(String[] strs) {
    int max = 0;

    for (String str : strs) {
      if (isANumeric(str)) {
        max = Math.max(Integer.valueOf(str), max);
      } else {
        max = Math.max(str.length(), max);
      }
    }

    return max;
  }

  private boolean isANumeric(String str) {
    char[] chars = str.toCharArray();

    for (char c : chars) {
      if ((int) c >= 97 && (int) c <= 122) return false;
    }

    return true;
  }
}