/*
2108. Find First Palindromic String in the Array

Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.
*/

class Solution2108 {
  public String firstPalindrome(String[] words) {

    for (String word : words) {
      if(isPalindrome(word, word.length())) return word;
    }

    return "";
  }

  private boolean isPalindrome(String word, int wordLen) {
    if (wordLen == 1) return true;

    for (int i = 0; i < wordLen/2; i++) {
      if (word.charAt(i) != word.charAt(wordLen - i - 1)) return false;
    }

    return true;
  }
}