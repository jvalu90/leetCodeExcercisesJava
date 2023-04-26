/*
1704. Determine if String Halves Are Alike

You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.
*/

class Solution1704 {
  public boolean halvesAreAlike(String s) {
    String string1 = s.substring(0, s.length()/2);
    String string2 = s.substring(s.length()/2, s.length());
    return  countVowels(string1) == countVowels(string2);
  } 

  private int countVowels(String s) {
    int response = 0;
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    s.toLowerCase();

    for(char c : s.toCharArray()) {
      for (char v : vowels) {
        if(c == v) response++;
      }
    }

    return response;
  }
}