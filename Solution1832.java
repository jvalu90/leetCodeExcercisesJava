/*
1832. Check if the Sentence Is Pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
*/

import java.util.*;
import java.util.stream.*;

class Solution1832 {
  public boolean checkIfPangram(String sentence) {
    if(sentence.length() < 26) return false;
    
    Set<Character> set = new HashSet<>(sentence.chars().mapToObj(c -> (char) c).collect(Collectors.toList()));
    return set.size() == 26;

  }
}