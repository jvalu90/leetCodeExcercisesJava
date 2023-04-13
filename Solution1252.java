/*
1252. Cells with Odd Values in a Matrix

There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

    Increment all the cells on row ri.
    Increment all the cells on column ci.

Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
*/

class Solution1252 {
  public int oddCells(int m, int n, int[][] indices) {
    int[][] ceroMatrix = new int[m][n];

    for (int[] indice : indices) {
      ceroMatrix = incrementRows(indice[0], ceroMatrix, n);
      ceroMatrix = incrementColumns(indice[1], ceroMatrix, m);
    }

    return checkOdds(ceroMatrix, m, n);
  }

  private int[][] incrementRows(int row, int[][] matrix, int n) {
    for (int i = 0; i < n; i++) {
      matrix[row][i]++;
    }

    return matrix;    
  }

  private int[][] incrementColumns(int column, int[][] matrix, int m) {
    for (int i = 0; i < m; i++) {
      matrix[i][column]++;
    }

    return matrix;  
  }

  private int checkOdds(int[][] matrix, int m, int n) {
    int odds = 0;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] % 2 != 0) odds++;
      }
    }

    return odds;
  }
}