/*
2788. Split Strings by Separator

Given an array of strings words and a character separator, split each string in words by separator.

Return an array of strings containing the new strings formed after the splits, excluding empty strings.

Notes

    separator is used to determine where the split should occur, but it is not included as part of the resulting strings.
    A split may result in more than two strings.
    The resulting strings must maintain the same order as they were initially given.
*/

class Solution2788 {
  public List<String> splitWordsBySeparator(List<String> words, char separator) {
    List<String> response = new ArrayList<>();

    for (String word : words) {
      String[] newWords = word.split( "\\Q" + String.valueOf(separator) + "\\E");
      for(String newWord : newWords) {
        if (newWord.isEmpty()) continue;
        response.add(newWord);
      }
    }
    return response;
  }
}