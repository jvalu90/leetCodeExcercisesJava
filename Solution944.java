/*
944. Delete Columns to Make Sorted

You are given an array of n strings strs, all of the same length.

The strings can be arranged such that there is one on each line, making a grid.

For example, strs = ["abc", "bce", "cae"] can be arranged as follows:

abc
bce
cae

You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted, while column 1 ('b', 'c', 'a') is not, so you would delete column 1.

Return the number of columns that you will delete.
*/

class Solution944 {
  public int minDeletionSize(String[] strs) {
    int response = 0;
    for (String str : strs) {
      if (verifyLexicographically(str)) response++;
    }

    return response;
  }

  private boolean verifyLexicographically(String str) {
    if (str.length() <= 1) return false;
    
    for (int i = 0; i < str.length() - 1; i++) {
      if ((str.charAt(i) - str.charAt(i + 1)) != 1) return false;
    }

    return true;
  }
}