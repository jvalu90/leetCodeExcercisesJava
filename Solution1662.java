/*
1662. Check If Two String Arrays are Equivalent

Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.
*/

class Solution1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String string: word1) {
            sb1.append(string);
        }

        StringBuilder sb2 = new StringBuilder();
        for (String string: word2) {
            sb2.append(string);
        }

      return sb1.toString().equals(sb2.toString()); 
    }
}