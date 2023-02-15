/*
2315. Count Asterisks

You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair. In other words, the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.

Return the number of '*' in s, excluding the '*' between each pair of '|'.

Note that each '|' will belong to exactly one pair.
*/

class Solution2315 {
  public int countAsterisks(String s) {
    int response = 0;
    String[] stringArray = s.split("\\|");
    if (stringArray.length == 0) return response;

    for(int i = 0; i < stringArray.length; i+=2) {
      String word = stringArray[i];
      for(int j = 0; j < word.length(); j++) {
        if(word.charAt(j) == '*') response++;
      }
    }
    return response;
  }
}