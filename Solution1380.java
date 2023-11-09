/*
1380. Lucky Numbers in a Matrix

Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
*/

class Solution1380 {
  public List<Integer> luckyNumbers (int[][] matrix) {
    List<Integer> response = new ArrayList<>();

    for (int i = 0; i < matrix.length; i++) {
      int rowMin = minFromRow(matrix, i);
      for (int j = 0; j < matrix[i].length; j++) {
        int columnMax = maxFromColumn(matrix, j);
        if (rowMin == columnMax) {
          response.add(rowMin);
        }
      }
    }
    return response;      
  }

  private int minFromRow(int[][] matrix, int rowIndex) {
    int min = Integer.MAX_VALUE;
    for (int j = 0; j < matrix[rowIndex].length; j++) {
      if (matrix[rowIndex][j] < min) {
        min = matrix[rowIndex][j];
      }
    }

    return min;
  }

  private int maxFromColumn(int[][] matrix, int columnIndex) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i][columnIndex] > max) {
        max = matrix[i][columnIndex];
      }
    }

    return max;
  }
}