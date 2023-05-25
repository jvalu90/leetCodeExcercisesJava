/*
2185. Counting Words With a Given Prefix

You are given an array of strings words and a string pref.

Return the number of strings in words that contain pref as a prefix.

A prefix of a string s is any leading contiguous substring of s.
*/

class Solution2185 {
  public int prefixCount(String[] words, String pref) {
    int response = 0; 

    for (String word : words) {
      if (word.startsWith(pref)) response++;
    }

    return response;
  }
}