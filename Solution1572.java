/*
1572. Matrix Diagonal Sum

Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
*/

class Solution1572 {
  public int diagonalSum(int[][] mat) {
    int response = 0;

    if(mat.length == 1) return mat[0][0];

    for (int i = 0; i < mat.length; i++) {
      response += rowSum(mat[i], i);
    }

    return response;
  }

  private int rowSum(int[] row, int index) {
    int length = row.length -1;
    if(index == length - index) return row[index];
    return row[index] + row[length - index];
  }
}