/*
2351. First Letter to Appear Twice

Given a string s consisting of lowercase English letters, return the first letter to appear twice.

Note:

    A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
    s will contain at least one letter that appears twice.
*/

class Solution2351 {
  public char repeatedCharacter(String s) {
    int[] bucket = new int[27];

    for (int i = 0; i < s.length(); i++) {
      if (++bucket[s.charAt(i) - 'a'] == 2) return s.charAt(i);
    }

    return 'a';
  }
}