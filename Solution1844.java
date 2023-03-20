/*
1844. Replace All Digits with Characters

You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.

There is a function shift(c, x), where c is a character and x is a digit, that returns the xth character after c.

    For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.

For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).

Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.
*/

class Solution1844 {
  public String replaceDigits(String s) {
    StringBuilder sb = new StringBuilder();
    int length = s.length();

    for (int i = 1; i < length; i += 2) {
      int index = Character.getNumericValue(s.charAt(i));
      sb.append(s.charAt(i-1));
      sb.append(shift(s.charAt(i-1), index));
    }

    if(length % 2 != 0) sb.append(s.charAt(length-1));  

    return sb.toString();
  }

  private char shift(char c, int index) {
    int cAs = (int) c;
    return (char) (cAs + index);
  }
}