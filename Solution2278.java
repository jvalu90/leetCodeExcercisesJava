/*
2278. Percentage of Letter in String

Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.
*/

class Solution2278 {
  public int percentageLetter(String s, char letter) {
    if (!s.contains(Character.toString(letter))) {
      return 0;
    }

    int length = s.length();
    int counter = 0;

    for (int i = 0; i < length; i++) {
      if (s.charAt(i) == letter) {
        counter++;
      }
    }

    return (counter * 100 ) / length;
  }
}