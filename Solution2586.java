/*
2586. Count the Number of Vowel Strings in Range

ou are given a 0-indexed array of string words and two integers left and right.

A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].
*/

class Solution2586 {
  public int vowelStrings(String[] words, int left, int right) {
    int vowelString = 0;

    for (int i = left; i <= right; i++) {
      if(verifyVowelString(words[i])) vowelString++;
    }

    return vowelString;
  }

  private boolean verifyVowelString(String word) {
    String vowels = "aeiou";
    if(vowels.indexOf(word.charAt(0)) >= 0 && vowels.indexOf(word.charAt(word.length() - 1)) >= 0) return true;
    return false;
  }
}