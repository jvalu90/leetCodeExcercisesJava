/*
2697. Lexicographically Smallest Palindrome

You are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it. In one operation, you can replace a character in s with another lowercase English letter.

Your task is to make s a palindrome with the minimum number of operations possible. If there are multiple palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.

A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.

Return the resulting palindrome string.
*/

class Solution2697 {
  public String makeSmallestPalindrome(String s) {
    char[] ch = s.toCharArray();
    int length = s.length();
    return iterateCharArray(ch, length);
  }

  private String iterateCharArray(char[] ch, int length) {
    for (int i = 0; i < length / 2; i++) {
      if(ch[i] != ch[length -1 - i]) {
        ch[i] = checkChars(ch[i], ch[length -1 - i]);
        ch[length -1 - i] = checkChars(ch[i], ch[length -1 - i]);
      }
    }

    return String.valueOf(ch);
  }

  private char checkChars(char ch1, char ch2) {
    return ch1 < ch2 ? ch1 : ch2;
  }
}