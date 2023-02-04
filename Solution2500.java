/*
2500. Delete Greatest Value in Each Row

You are given an m x n matrix grid consisting of positive integers.

Perform the following operation until grid becomes empty:

    Delete the element with the greatest value from each row. If multiple such elements exist, delete any of them.
    Add the maximum of deleted elements to the answer.

Note that the number of columns decreases by one after each operation.

Return the answer after performing the operations described above.
*/

import java.util.Arrays;

class Solution2500 {
  public int deleteGreatestValue(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int response = 0;
    grid = gridOrder(grid);
    
    for (int column = 0; column < n; column++){
      int maxInRows = 0;
      for (int row = 0; row < m; row++) {
        maxInRows = Math.max(maxInRows, grid[row][column]);
      } 

      response += maxInRows;
    }
    return response;
  }

  private int[][] gridOrder(int[][] originalGrid) {
    for (int[] row : originalGrid){
      Arrays.sort(row);
    }    
    return originalGrid;
  }
}