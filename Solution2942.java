/*
2942. Find Words Containing Character

You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order.
*/

class Solution2942 {
  public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> response = new ArrayList<>();

    for (int i = 0; i < words.length; i++) { 
      if (words[i].indexOf(x) != -1) {
        response.add(i);
      }
    }

    return response;      
  }
}