/*
1876. Substrings of Size Three with Distinct Characters

A string is good if there are no repeated characters.

Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.
*/

class Solution1876 {
  public int countGoodSubstrings(String s) {
    int response = 0;

    for (int i = 0; i < s.length() - 2; i++) {
      if (validateString(s.substring(i, i + 3))) response++;
    }

    return response;
  }

  private boolean validateString(String s) {
    return s.charAt(0) !=  s.charAt(1)
          && s.charAt(0) !=  s.charAt(2)
          && s.charAt(1) !=  s.charAt(2);
  }
}