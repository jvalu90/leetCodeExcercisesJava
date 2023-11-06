/*
821. Shortest Distance to a Character

Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
*/

class Solution821 {
  public int[] shortestToChar(String s, char c) {
    char[] chars = s.toCharArray();
    int[] response = new int[s.length()];
    List<Integer> indexes = getIndexes(chars, c);

    for (int i = 0; i< chars.length; i++) {
      response[i] = getMinimunIndex(i, indexes);
    }

    return response;
  }

  private List<Integer> getIndexes(char[] chars, char c) {
    List<Integer> response = new ArrayList<>();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == c) response.add(i); 
    }

    return response;
  }

  private int getMinimunIndex(int index, List<Integer> indexes) {
    int min = 1000;
    for (Integer i : indexes) {
      min = Math.min(min, Math.abs(i - index));
    }

    return min;
  }
}