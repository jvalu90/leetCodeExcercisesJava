/*
1221. Split a String in Balanced Strings

Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

    Each substring is balanced.

Return the maximum number of balanced strings you can obtain.
*/

class Solution1221 {
    public int balancedStringSplit(String s) {
      StringBuilder newString = new StringBuilder(s);
      int unmatchCharactersCounter = 0;
      int response = 0;
      
      for(int i = 0; i < newString.length(); i++) {
        if(newString.charAt(i) == 'R') unmatchCharactersCounter++;
        if(newString.charAt(i) == 'L') unmatchCharactersCounter--;
        if(unmatchCharactersCounter == 0) response++;
      }

      return response;
    }
}