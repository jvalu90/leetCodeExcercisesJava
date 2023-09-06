/*
1935. Maximum Number of Words You Can Type

There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.
*/

class Solution1935 {
  public int canBeTypedWords(String text, String brokenLetters) {
    String[] splited = text.split("\\s+");
    int response = splited.length;

    for (String word : splited) {
      for (char ch : brokenLetters.toCharArray()) {
        if (word.indexOf(ch) != -1) {
          response--;
          break;
        }
      }
    }

    return response;
  }
}