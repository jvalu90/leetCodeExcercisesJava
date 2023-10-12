/*
2423. Remove Letter To Equalize Frequency

You are given a 0-indexed string word, consisting of lowercase English letters. You need to select one index and remove the letter at that index from word so that the frequency of every letter present in word is equal.

Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise.

Note:

    The frequency of a letter x is the number of times it occurs in the string.
    You must remove exactly one letter and cannot chose to do nothing.
*/

class Solution2423 {
  public boolean equalFrequency(String word) {
        int len = word.length();
        int[] count = new int[26];
        for (int i = 0; i < len; ++ i) {
            char c = word.charAt(i);
            count[c - 'a'] ++;
        }
        for (int i = 0; i < len; ++ i) {
            char c = word.charAt(i);
            count[c - 'a'] --;
            if (equalCount(count)) {
                return true;
            }
            count[c - 'a'] ++;
        }
        
        return false;
    }
    
    public boolean equalCount(int[] count) {
        int c = 0;
        
        for (int i: count) {
            if (i == 0) {
                continue;
            } else if (c == 0) {
                c = i;
            } else if (c == i) {
                continue;
            } else {
                return false;
            }
        }
        
        return true;
    }
}