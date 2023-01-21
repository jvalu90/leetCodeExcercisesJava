/*
2373. Largest Local Values in a Matrix

You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

    maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.

In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

Return the generated matrix.
*/

class Solution2373 {
  public int[][] largestLocal(int[][] grid) {
    int responseLength = grid.length -2;
    int[][] response = new int[responseLength][responseLength];

    for(int i = 0; i < responseLength; i++) {
      for(int j = 0; j < responseLength; j++) {
        response[i][j] = maxInMatrix(fillMatrix(i, j, grid));
      }
    }

    return response;
  }

  private int[][] fillMatrix(int row, int column, int[][] grid) {
    int[][] threeGrid = new int[3][3];

    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        threeGrid[i][j] = grid[row + i][column + j];
      }      
    }
  
    return threeGrid;
  }

  private int maxInMatrix(int[][] threeGrid) {
    int stop = threeGrid.length;
    int max = 0;
    for(int i = 0; i < stop; i++) {
      for(int j = 0; j < stop; j++) {
        max = Math.max(max, threeGrid[i][j]);
      }
    }
    return max;
  }
}