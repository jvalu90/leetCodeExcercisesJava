/*
1941. Check if All Characters Have Equal Number of Occurrences

Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
*/

import java.util.*;

class Solution1941 {
  public boolean areOccurrencesEqual(String s) {
    Map<Character, Integer> letters = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      if(!letters.containsKey(s.charAt(i))) {
        letters.put(s.charAt(i), 1);
      } else {
        letters.put(s.charAt(i), letters.get(s.charAt(i)) + 1 );
      }
    }

    Integer comparator = letters.get(s.charAt(0));

    for (Integer value : letters.values()) {
      if (!value.equals(comparator)) return false;
    }

    return true;
  }
}