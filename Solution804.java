/*
804. Unique Morse Code Words

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

    'a' maps to ".-",
    'b' maps to "-...",
    'c' maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]

Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.

    For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.

Return the number of different transformations among all words we have.
*/

import java.util.HashSet;

class Solution804 {
  public int uniqueMorseRepresentations(String[] words) {
    HashSet<String> set = new HashSet<String>();    

    for (String word : words) {
      set.add(convertWord(word));
    }

    return set.size();
  }

  private String convertWord(String word) {
    String[] conversionArray = new String[]{
      ".-",
      "-...",
      "-.-.",
      "-..",
      ".",
      "..-.",
      "--.",
      "....",
      "..",
      ".---",
      "-.-",
      ".-..",
      "--",
      "-.",
      "---",
      ".--.",
      "--.-",
      ".-.",
      "...",
      "-",
      "..-",
      "...-",
      ".--",
      "-..-",
      "-.--",
      "--.."
    };

    char[] charArray = word.toCharArray();
    StringBuilder sb = new StringBuilder();

    for (char ch : charArray) {
      int index = (int) ch - 97;
      sb.append(conversionArray[index]);
    }

    return sb.toString();
  }
}