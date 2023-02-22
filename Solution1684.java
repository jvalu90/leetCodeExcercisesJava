/*
1684. Count the Number of Consistent Strings

You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.
*/
import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

class Solution1684 {
  public int countConsistentStrings(String allowed, String[] words) {
    int response = 0;
    char[] allowedArray = allowed.toCharArray();
    Arrays.sort(allowedArray);

    for (String word : words) {
      if(word.length() < allowed.length()) continue;

      char[] wordArray = word.toCharArray();
      Arrays.sort(wordArray);
      Set<Character> wordSet = new HashSet<>();

      for (char c : wordArray) {
        wordSet.add(c);
      }

      System.out.println(String.valueOf(allowedArray));
      System.out.println(String.valueOf(wordSet.toArray(new String[0])));

      // TODO: Separar en un metodo la conversion de un word a un set y luego a un string, comparar dos strings
      
      if(String.valueOf(allowedArray).equals(String.valueOf(wordSet))) response++;
    }

    return response;
  }

}