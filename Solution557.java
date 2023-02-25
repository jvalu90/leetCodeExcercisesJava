/*
557. Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
*/

import java.lang.*;
import java.io.*;
import java.util.*;

class Solution557 {
  public String reverseWords(String s) {
    String[] words = s.split("\\s+");
    String response ="";
    
    for (String word : words) {
      StringBuilder sb = new StringBuilder(word);
      response += sb.reverse().toString() + " ";
    }

    return response.trim();
  }
}