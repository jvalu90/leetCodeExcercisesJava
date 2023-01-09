/*
2325. Decode the Message

You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

    Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
    Align the substitution table with the regular English alphabet.
    Each letter in message is then substituted using the table.
    Spaces ' ' are transformed to themselves.

    For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').

Return the decoded message.
*/

import java.util.*;

class Solution2325 {
  public String decodeMessage(String key, String message) { 
    StringBuilder response = new StringBuilder();
    Map <Character, Integer> map = generateMapString(removeRepeatedCharsAndSpaces(key));
    char[] characters = message.toCharArray();
    
    for(Character c: characters){
      response.append(Character.toString(map.get(c)));
    }
    
    return response.toString();
  }

  private String removeRepeatedCharsAndSpaces(String str) {
    str = str.replaceAll("\\s","");
    String outputString = new StringBuilder(str).reverse().toString();
    outputString = outputString.replaceAll("(.)(?=.*\\1)", "");
    outputString = new StringBuilder(outputString).reverse().toString();
    return outputString;
  }

  private Map <Character, Integer> generateMapString(String sentence){
    Map <Character, Integer> map = new HashMap<>();
    char[] characters = sentence.toCharArray();
      
    map.put(' ', 32);
    Integer ascci = 97;
    
    for(Character c : characters){
      map.put(c, ascci);
      ascci+=1;
    }

    return map;
  }
}