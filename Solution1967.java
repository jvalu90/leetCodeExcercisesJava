/*
1967. Number of Strings That Appear as Substrings in Word

Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.

A substring is a contiguous sequence of characters within a string.
*/

class Solution1967 {
  public int numOfStrings(String[] patterns, String word) {
    int counter = 0;

    for (String pattern : patterns) {
      if (word.contains(pattern)) counter++;
    }

    return counter;
  }
}