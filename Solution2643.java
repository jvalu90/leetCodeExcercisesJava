/*
2643. Row With Maximum Ones

Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum count of ones, and the number of ones in that row.

In case there are multiple rows that have the maximum count of ones, the row with the smallest row number should be selected.

Return an array containing the index of the row, and the number of ones in it.
*/

class Solution2643 {
  public int[] rowAndMaximumOnes(int[][] mat) {
    int[] response = {0, 0};

    for (int i = 0; i < mat.length; i++) {
      int temp = checkOnes(mat[i]);
      if (temp > response[1]) {
        response[0] = i;
        response[1] = temp;
      }
    }

    return response;
  }

  private int checkOnes(int[] row) {
    int count = 0;
    for (int i = 0; i < row.length; i++) {
      if (row[i] == 1) count++;
    }

    return count;
  }
}