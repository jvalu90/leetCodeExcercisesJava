/*
2744. Find Maximum Number of String Pairs

You are given a 0-indexed array words consisting of distinct strings.

The string words[i] can be paired with the string words[j] if:

    The string words[i] is equal to the reversed string of words[j].
    0 <= i < j < words.length.

Return the maximum number of pairs that can be formed from the array words.

Note that each string can belong in at most one pair.
*/

class Solution2744 {
  public int maximumNumberOfStringPairs(String[] words) {
    int counter = 0;

    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (words[i].equals(reverseString(words[j]))) counter++;
      }
    }

    return counter;
  }

  public String reverseString(String word) {
    StringBuilder sb = new StringBuilder(word);
    return sb.reverse().toString();
  }
}