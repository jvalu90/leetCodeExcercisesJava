/*
2114. Maximum Number of Words Found in Sentences

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.
*/

class Solution2114 {
  public int mostWordsFound(String[] sentences) {
    int maxLength = 0;

    for(int i = 0; i < sentences.length; i++) {
      maxLength = Math.max(maxLength, sentences[i].split(" ").length);  
    }

    return maxLength;
  }
}