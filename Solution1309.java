/*
1309. Decrypt String from Alphabet to Integer Mapping

You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

    Characters ('a' to 'i') are represented by ('1' to '9') respectively.
    Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.

Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.
*/

class Solution1309 {
  public String freqAlphabets(String s) {
    StringBuilder sb = new StringBuilder();
    
    for(int i = s.length() - 1; i >= 0; i--) {
      if(s.charAt(i) == '#') {
        int temp = Integer.parseInt(s.substring(i - 2, i));
        sb.insert(0, (char) (temp + 96));
        i -= 2;
      } else {
        sb.insert(0, (char) (s.charAt(i) - '0' + 96));
      }
    }
    
    return sb.toString();
  }
}