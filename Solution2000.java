/*
2000. Reverse Prefix of Word

Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

    For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".

Return the resulting string.
*/

import java.util.*;

class Solution2000 {
  public String reversePrefix(String word, char ch) {
    int firstOcurrence = word.indexOf(ch);
    
    if (firstOcurrence == -1) {
      return word;
    } else {
      StringBuilder firstWord = new StringBuilder();
      
      firstWord.append(word.substring(0, firstOcurrence +1));
      firstWord.reverse();
      return firstWord.append(word.substring(firstOcurrence + 1, word.length())).toString();
    }
  }
}