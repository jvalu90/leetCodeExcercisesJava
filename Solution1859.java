/*
1859. Sorting the Sentence

A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

    For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".

Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
*/

import java.util.ArrayList;
import java.util.Arrays;

class Solution1859 {
    public String sortSentence(String s) {
      String[] strArr = s.split(" ");
      ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArr));
      list.sort((a,b) -> a.charAt(a.length()-1) - b.charAt(b.length()-1));
      strArr = list.stream().map(word -> word.substring(0, word.length() -1)).toArray(String[]::new);      
      return String.join(" ", strArr);
    }
}